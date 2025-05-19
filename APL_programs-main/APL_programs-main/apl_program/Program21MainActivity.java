package com.example.apl_program;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Program21MainActivity extends AppCompatActivity {

    EditText idInput, nameInput, emailInput;
    Button updateBtn;
    DatabaseHelper dbHelper;
    TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program21_main);

        dbHelper = new DatabaseHelper(this);

        idInput = findViewById(R.id.idInput);
        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        updateBtn = findViewById(R.id.updateButton);
        statusText = findViewById(R.id.statusText);

        updateBtn.setOnClickListener(v -> {
            String idStr = idInput.getText().toString().trim();
            String name = nameInput.getText().toString().trim();
            String email = emailInput.getText().toString().trim();

            if(idStr.isEmpty() || name.isEmpty() || email.isEmpty()) {
                statusText.setText("Please enter id, name and email");
                return;
            }

            int id = Integer.parseInt(idStr);
            boolean updated = dbHelper.updateUser(id, name, email);
            statusText.setText(updated ? "Data updated successfully" : "Update failed");
        });
    }
}
