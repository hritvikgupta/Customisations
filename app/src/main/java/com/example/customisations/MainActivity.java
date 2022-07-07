package com.example.customisations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etFirstName, etLastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etfirstname);
        etLastName = findViewById(R.id.etlastname);

        String [] names = {"Hritvik", "Hayush", "Hman", "Harendra"};
        String [] surname = {"Gupta", "Modi", "Paliwal", "Thakur"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);

        ArrayAdapter<String> adapter1 =
                new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, surname);

        etFirstName.setThreshold(1); //This means after how many characters it starts showing the list of different names of strings
        etLastName.setThreshold(1);
        etLastName.setAdapter(adapter1);
        etFirstName.setAdapter(adapter);




    }
}