package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String SIN_INPUT = "com.example.calc.SIN_INPUT";
    public static final String COS_INPUT = "com.example.calc.COS_INPUT";
    public static final String TAN_INPUT = "com.example.calc.TAN_INPUT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /** Called when the user taps the Send button */
    public void doSin(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CalcSinActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(SIN_INPUT, message);
        startActivity(intent);
    }



    /** Called when the user taps the Send button */
    public void doCos(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CalcCosActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(COS_INPUT, message);
        startActivity(intent);
    }


    /** Called when the user taps the Send button */
    public void doTan(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CalcTanActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString();
        intent.putExtra(TAN_INPUT, message);
        startActivity(intent);
    }
}
