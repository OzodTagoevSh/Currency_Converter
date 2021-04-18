package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter(View view) {

        Log.i("Info", "Button pressed!");

        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);
        String amountInPounds = currencyEditText.getText().toString();
        Log.i("Pound Value", amountInPounds);
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = 1.38 * amountInPoundsDouble;

        String amountInDollars = String.format("%.2f", amountInDollarsDouble);
        Log.i("Dollar Value", amountInDollars);
        Toast.makeText(this, "£" + amountInPounds + " is $" + amountInDollars,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}