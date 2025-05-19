package com.example.apl_program;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// Main activity with a button that opens a second activity
public class Program11MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program11_main);

        Button openSecond = findViewById(R.id.openSecondButton);
        openSecond.setOnClickListener(v -> {
            Intent intent = new Intent(Program11MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }

    // Inner class: Second activity
    public static class SecondActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_program11_second);
        }
    }
}
