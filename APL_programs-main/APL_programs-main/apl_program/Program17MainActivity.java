package com.example.apl_program;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program17MainActivity extends AppCompatActivity {

    Button popupButton;
    TextView popupResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program17_main);

        popupButton = findViewById(R.id.popupButton);
        popupResult = findViewById(R.id.popupResult);

        popupButton.setOnClickListener(v -> {
            PopupMenu popup = new PopupMenu(Program17MainActivity.this, popupButton);
            MenuInflater inflater = popup.getMenuInflater();
            inflater.inflate(R.menu.popup_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> {
                popupResult.setText("Selected: " + item.getTitle());
                return true;
            });
            popup.show();
        });
    }
}
