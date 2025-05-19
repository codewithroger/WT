package com.example.apl_program;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program25MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView ratingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program25_main);

        ratingBar = findViewById(R.id.ratingBar);
        ratingText = findViewById(R.id.ratingText);

        ratingBar.setOnRatingBarChangeListener((bar, rating, fromUser) -> {
            ratingText.setText("Rating: " + rating);
        });
    }
}
