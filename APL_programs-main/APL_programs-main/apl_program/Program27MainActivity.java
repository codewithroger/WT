package com.example.apl_program;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class Program27MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView toggleStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program27_main);

        toggleButton = findViewById(R.id.toggleButton);
        toggleStatus = findViewById(R.id.toggleStatus);

        toggleStatus.setText(toggleButton.isChecked() ? "ON" : "OFF");

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleStatus.setText("ON");
            } else {
                toggleStatus.setText("OFF");
            }
        });
    }
}
