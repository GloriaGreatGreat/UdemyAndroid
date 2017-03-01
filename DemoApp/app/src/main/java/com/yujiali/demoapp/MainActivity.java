package com.yujiali.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myUsername = (EditText)findViewById(R.id.myUsername);
        EditText myPassword = (EditText)findViewById(R.id.myPassword);
        Log.i("Username", myUsername.getText().toString());
        Log.i("Password", myPassword.getText().toString());
        //Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, myUsername.getText().toString(), Toast.LENGTH_SHORT).show();

        ImageView image = (ImageView) findViewById(R.id.imageView);
        //image.setImageResource(R.drawable.xxx);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

