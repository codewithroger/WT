package com.example.apl_program;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program22MainActivity extends AppCompatActivity {

    EditText inputText;
    Button saveBtn;
    TextView statusText;
    private static final String FILE_NAME = "apl_data.txt";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program22_main);

        inputText = findViewById(R.id.inputText);
        saveBtn = findViewById(R.id.saveButton);
        statusText = findViewById(R.id.statusText);

        saveBtn.setOnClickListener(v -> {
            String data = inputText.getText().toString();
            if (data.isEmpty()) {
                statusText.setText("Please enter text to save");
                return;
            }
            boolean success = saveToFile(data);
            statusText.setText(success ? "Data saved successfully" : "Error saving data");
        });
    }

    private boolean saveToFile(String data) {
        try (FileOutputStream fos = openFileOutput(FILE_NAME, MODE_PRIVATE)) {
            fos.write(data.getBytes());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
