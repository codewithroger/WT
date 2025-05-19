package com.example.apl_program;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program3MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program3_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText inputName = findViewById(R.id.inputName);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button showButton = findViewById(R.id.showButton);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView resultText = findViewById(R.id.resultText);

        showButton.setOnClickListener(v -> {
            String name = inputName.getText().toString().trim();
            resultText.setText("Hello, " + name + "!");
        });
    }
}
