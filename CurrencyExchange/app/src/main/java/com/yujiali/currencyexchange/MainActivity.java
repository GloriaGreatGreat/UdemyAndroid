package com.yujiali.currencyexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.75;
        Toast.makeText(MainActivity.this, "Pound" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
