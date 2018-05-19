package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {
    public void convert(View view)
    {
        Log.i("Info", "Button Pressed");
        EditText text = (EditText) findViewById(R.id.dollarAmt);
        double dAmt = Double.parseDouble(text.getText().toString());
        double rAmt = Math.floor((dAmt * 65.08)*100)/100;

        Toast.makeText(this, "$ "+ dAmt + " = " + "\u20B9 " + rAmt, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
