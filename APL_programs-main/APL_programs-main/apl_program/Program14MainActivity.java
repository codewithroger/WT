package com.example.apl_program;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Program14MainActivity extends AppCompatActivity {

    Button showDialogBtn;
    TextView resultText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program14_main);

        showDialogBtn = findViewById(R.id.showDialogButton);
        resultText = findViewById(R.id.resultText);

        showDialogBtn.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Confirmation")
                    .setMessage("Do you want to proceed?")
                    .setPositiveButton("Yes", (dialog, which) -> resultText.setText("You chose: Yes"))
                    .setNegativeButton("No", (dialog, which) -> resultText.setText("You chose: No"))
                    .setNeutralButton("Cancel", (dialog, which) -> resultText.setText("You chose: Cancel"))
                    .show();
        });
    }
}
