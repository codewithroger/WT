package com.example.apl_program;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Program20MainActivity extends AppCompatActivity {

    ListView listView;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program20_main);

        dbHelper = new DatabaseHelper(this);
        listView = findViewById(R.id.userListView);

        loadData();
    }

    private void loadData() {
        Cursor cursor = dbHelper.getAllUsers();
        if(cursor.getCount() == 0) {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
            return;
        }

        String[] users = new String[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_ID));
            String name = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_NAME));
            String email = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseHelper.COL_EMAIL));
            users[i++] = id + ". " + name + " (" + email + ")";
        }
        cursor.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, users);
        listView.setAdapter(adapter);
    }
}
