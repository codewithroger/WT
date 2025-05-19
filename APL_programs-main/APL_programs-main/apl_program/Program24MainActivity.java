package com.example.apl_program;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program24MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView percentageText;
    int progressStatus = 0;
    Handler handler = new Handler(); // To update UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program24_main);

        progressBar = findViewById(R.id.progressBar);
        percentageText = findViewById(R.id.percentageText);

        // Simulate progress update using a thread
        new Thread(() -> {
            while (progressStatus <= 100) {
                int current = progressStatus;
                handler.post(() -> {
                    progressBar.setProgress(current);
                    percentageText.setText(current + " %");
                });
                try {
                    Thread.sleep(50); // slow update
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressStatus++;
            }
        }).start();
    }
}
