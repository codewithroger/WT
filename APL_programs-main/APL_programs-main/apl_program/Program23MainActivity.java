package com.example.apl_program;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program23MainActivity extends AppCompatActivity {

    Button startButton;
    TextView statusText;
    Handler mainHandler = new Handler(); // For posting updates to UI thread

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program23_main);

        startButton = findViewById(R.id.startThreadButton);
        statusText = findViewById(R.id.statusText);

        startButton.setOnClickListener(v -> {
            statusText.setText("Thread started...");

            // Start a background thread
            new Thread(() -> {
                try {
                    Thread.sleep(4000); // Simulate a task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Update UI after the task is done
                mainHandler.post(() -> statusText.setText("Thread completed!"));
            }).start();
        });
    }
}
