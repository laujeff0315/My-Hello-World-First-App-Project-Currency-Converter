package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertValue(View view) {

        EditText numbers = (EditText) findViewById(R.id.editTextNumberDecimal);
        double number = Double.parseDouble(numbers.getText().toString());
        double converted = number*9.87;
        String value = String.format("%.2f",converted);

        Toast.makeText(this, "GBD "+ numbers.getText().toString()+ " is HKD "+ value +".", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}