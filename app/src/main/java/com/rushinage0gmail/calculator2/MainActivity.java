package com.rushinage0gmail.calculator2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = (EditText) findViewById(R.id.editText);
    }

    public void claculateSquare(View v) {
        double number = Double.parseDouble(etNumber.getText().toString());
        double square = number * number;
        Toast.makeText(this, "square" + number + "is" + square, Toast.LENGTH_LONG).show();
    }

    public void claculateSquareroot(View v) {
        double number = Double.parseDouble(etNumber.getText().toString());
        double squareroot = Math.sqrt(number);
        Toast.makeText(getApplicationContext(), "squareroot" + number + "is" + squareroot, Toast.LENGTH_LONG).show();
    }
    public void claculateCube(View v) {
        double number = Double.parseDouble(etNumber.getText().toString());
        double cube = number*number*number;
        Toast.makeText(MainActivity.this, "cube" + number + "is" + cube, Toast.LENGTH_LONG).show();
    }
}
