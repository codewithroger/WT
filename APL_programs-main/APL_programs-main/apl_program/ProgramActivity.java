package com.example.apl_program;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProgramActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        int programNumber = getIntent().getIntExtra("program_number", 0);
        TextView textView = findViewById(R.id.programText);

        String output;
        switch (programNumber) {
            case 1:
                output = "Program 1:\nWrite a program for creating the new activity for the button click.";
                break;
            default:
                output = "Program #" + programNumber + " content not added yet.";
                break;
        }

        textView.setText(output);
    }
}
