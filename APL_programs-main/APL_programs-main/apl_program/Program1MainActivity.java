package com.example.apl_program;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apl_program.R;

// Main Activity with Button
public class Program1MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program1_main);

        Button openButton = findViewById(R.id.openActivityBtn);
        openButton.setOnClickListener(v -> {
            Intent intent = new Intent(Program1MainActivity.this, Program1SecondActivity.class);
            startActivity(intent);
        });
    }
}

// Second Activity to display a message
class Program1SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program1_second);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView secondText = findViewById(R.id.secondText);
        secondText.setText("This is the second activity opened on button click.");
    }
}
