package com.example.apl_program;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Program12MainActivity extends AppCompatActivity {
    EditText nameInput, emailInput;
    CheckBox termsCheckbox;
    RadioGroup genderGroup;
    ToggleButton toggleNewsletter;
    Button submitButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program12_main);

        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        termsCheckbox = findViewById(R.id.termsCheckbox);
        genderGroup = findViewById(R.id.genderGroup);
        toggleNewsletter = findViewById(R.id.toggleNewsletter);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        submitButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();
            String email = emailInput.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty()) {
                resultText.setText("Please enter all details.");
                return;
            }

            if (!termsCheckbox.isChecked()) {
                resultText.setText("Please accept the terms.");
                return;
            }

            int selectedGenderId = genderGroup.getCheckedRadioButtonId();
            if (selectedGenderId == -1) {
                resultText.setText("Please select gender.");
                return;
            }

            RadioButton selectedGender = findViewById(selectedGenderId);
            String gender = selectedGender.getText().toString();

            boolean newsletter = toggleNewsletter.isChecked();

            String result = "Name: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Gender: " + gender + "\n" +
                    "Newsletter: " + (newsletter ? "Subscribed" : "Not Subscribed");

            resultText.setText(result);
        });
    }
}
