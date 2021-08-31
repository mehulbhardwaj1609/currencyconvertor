package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInPounds = editText.getText().toString();

        double inPounds = Double.parseDouble(amountInPounds);

        double inDollars = inPounds * 1.3;

        String amountInDollars = Double.toString(inDollars);

        //Log.i("Amount", amountInDollars);

        Toast.makeText(this, "P" + amountInPounds + " is $" + inDollars, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}