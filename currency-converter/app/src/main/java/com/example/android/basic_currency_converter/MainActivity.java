package com.example.android.basic_currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {

        EditText dollarAmount = findViewById(R.id.dollarAmount);
        EditText exchangeRate = findViewById(R.id.exchangeRate);

        // printing to logcat
        Log.i("Dollar Amount", dollarAmount.getText().toString());
        Log.i("Exchange Rate", exchangeRate.getText().toString());

        Double dollars = Double.parseDouble(dollarAmount.getText().toString());
        Double rate = Double.parseDouble(exchangeRate.getText().toString());
        Double rands = (dollars * rate);

        Toast.makeText(this, "$" + String.format("%.2f", dollars) + " is R" +
                String.format("%.2f", rands), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
