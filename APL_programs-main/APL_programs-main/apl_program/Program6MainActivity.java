package com.example.apl_program;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Program6MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program6_main);

        ListView listView = findViewById(R.id.listView);
        String[] items = {"Android", "Java", "Kotlin", "Firebase", "SQLite", "XML"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, items
        );

        listView.setAdapter(adapter);
    }
}
