package com.example.apl_program;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Program15MainActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program15_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); // Set custom toolbar as action bar

        resultText = findViewById(R.id.resultText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_home) {
            resultText.setText("You selected: Home");
            return true;
        } else if (id == R.id.menu_settings) {
            resultText.setText("You selected: Settings");
            return true;
        } else if (id == R.id.menu_logout) {
            resultText.setText("You selected: Logout");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
