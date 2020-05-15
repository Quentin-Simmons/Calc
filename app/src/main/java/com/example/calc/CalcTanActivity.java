package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalcTanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_tan);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String userInput = intent.getStringExtra(MainActivity.TAN_INPUT);
        Calculator calc = Calculator.getInstance();
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView3);
        double value = Double.parseDouble(userInput);

        try {
            double result = calc.doOperation(value, Calculator.Operation.TAN);
            textView.setText(String.valueOf(result));

        } catch (CalcException e)
        {
          textView.setText(e.getMessage());
        }


    }
}
