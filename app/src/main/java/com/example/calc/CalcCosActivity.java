package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Math;

public class CalcCosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_cos);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.COS_INPUT);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        Double f = Double.parseDouble(message);
        Double cos_f = Math.cos(f);
        textView.setText(cos_f.toString());
    }
}
