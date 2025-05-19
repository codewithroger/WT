package com.example.apl_program;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Program19MainActivity extends AppCompatActivity {

    EditText nameInput, emailInput;
    Button insertBtn;
    DatabaseHelper dbHelper;
    TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program19_main);

        dbHelper = new DatabaseHelper(this);

        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        insertBtn = findViewById(R.id.insertButton);
        statusText = findViewById(R.id.statusText);

        insertBtn.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();
            String email = emailInput.getText().toString().trim();

            if(name.isEmpty() || email.isEmpty()) {
                statusText.setText("Please enter name and email");
                return;
            }

            boolean inserted = dbHelper.insertUser(name, email);
            statusText.setText(inserted ? "Data inserted successfully" : "Insertion failed");
        });
    }
}
