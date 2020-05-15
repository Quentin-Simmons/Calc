package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Math;

public class CalcSinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_sin);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String userInput = intent.getStringExtra(MainActivity.SIN_INPUT);
        Calculator calc = Calculator.getInstance();
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        double value = Double.parseDouble(userInput);
        try {
            double result = calc.doOperation(value, Calculator.Operation.SIN);
            textView.setText(String.valueOf(result));
        } catch (CalcException e)
    {
        textView.setText(e.getMessage());
    }






}
}
