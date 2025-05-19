package com.example.apl_program;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.*;

import java.util.HashMap;
import java.util.Map;

public class SignupActivity extends AppCompatActivity {

    EditText nameInput, emailInput, passwordInput;
    Spinner divSpinner;
    Button signupButton;
    ProgressDialog progressDialog;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        divSpinner = findViewById(R.id.divSpinner);
        signupButton = findViewById(R.id.signupButton);

        db = FirebaseFirestore.getInstance();

        // ✅ Spinner setup with default "Choose Div"
        String[] divisions = {"Choose Div", "A", "B", "C"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, divisions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        divSpinner.setAdapter(adapter);

        // Optional: Style "Choose Div" differently
        divSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                if (position == 0) {
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.GRAY);
                } else {
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // ✅ Initialize ProgressDialog
        progressDialog = new ProgressDialog(SignupActivity.this);
        progressDialog.setMessage("Signing up...");
        progressDialog.setCancelable(false);

        signupButton.setOnClickListener(v -> signUpUser());
    }

    private void signUpUser() {
        String name = nameInput.getText().toString().trim();
        String email = emailInput.getText().toString().trim().toLowerCase();
        String div = divSpinner.getSelectedItem().toString();
        String password = passwordInput.getText().toString().trim();

        // ✅ Validation
        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || div.equals("Choose Div")) {
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!name.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
            Toast.makeText(this, "Enter a valid full name (e.g., MS Dhoni)", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Enter a valid email (e.g., deepak@gmail.com)", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.length() < 6) {
            Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
            return;
        }

        // ✅ Show loading
        progressDialog.show();

        String safeEmail = email.replace(".", "_");

        DocumentReference userDoc = db.collection("Users")
                .document("Div " + div)
                .collection(safeEmail)
                .document("Details");

        userDoc.get().addOnCompleteListener(task -> {
            if (task.isSuccessful() && task.getResult() != null && task.getResult().exists()) {
                // Email already exists — store as new with timestamp
                String timestampId = String.valueOf(System.currentTimeMillis());
                DocumentReference newDoc = db.collection("Users")
                        .document("Div " + div)
                        .collection(safeEmail + "_" + timestampId)
                        .document("Details");

                storeUserData(newDoc, name, email, div, password);
            } else {
                // New email — store directly
                storeUserData(userDoc, name, email, div, password);
            }
        });
    }

    private void storeUserData(DocumentReference docRef, String name, String email, String div, String password) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("name", name);
        userMap.put("email", email);
        userMap.put("div", div);
        userMap.put("password", password);

        docRef.set(userMap)
                .addOnSuccessListener(unused -> {
                    progressDialog.dismiss(); // ✅ Hide loader
                    Toast.makeText(SignupActivity.this, "Signup successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignupActivity.this, HomeActivity.class));
                    finish();
                })
                .addOnFailureListener(e -> {
                    progressDialog.dismiss(); // ✅ Hide loader
                    Toast.makeText(SignupActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }
}
