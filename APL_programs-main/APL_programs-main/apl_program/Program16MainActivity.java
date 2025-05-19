package com.example.apl_program;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Program16MainActivity extends AppCompatActivity {

    TextView contextText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program16_main);

        contextText = findViewById(R.id.contextText);
        registerForContextMenu(contextText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        new MenuInflater(this).inflate(R.menu.context_menu, menu);
        menu.setHeaderTitle("Select an action");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        contextText.setText("You selected: " + item.getTitle());
        return true;
    }
}
