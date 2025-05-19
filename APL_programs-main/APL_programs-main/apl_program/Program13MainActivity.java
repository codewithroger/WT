package com.example.apl_program;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Program13MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView selectedText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program13_main);

        spinner = findViewById(R.id.languageSpinner);
        selectedText = findViewById(R.id.selectedText);

        String[] languages = {"Java", "Kotlin", "C++", "Python", "JavaScript"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedText.setText("Selected: " + languages[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedText.setText("Nothing selected");
            }
        });
    }
}
