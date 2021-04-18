package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter(View view) {

        Log.i("Info", "Button pressed!");

        TextView currencyEditText = findViewById(R.id.currencyEditText);
        Double currencyAmount = Double.parseDouble(currencyEditText.getText().toString());
        Toast.makeText(this, "£" + currencyAmount + " is $" + 1.38 * currencyAmount, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}