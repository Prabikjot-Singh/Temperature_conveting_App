package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioButton ctof;
    private RadioButton ftoc;
    private EditText input;
    private TextView res;
    private double temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctof = (RadioButton) findViewById(R.id.ctof);
        ftoc = (RadioButton)findViewById(R.id.ftoc);
        input = (EditText) findViewById(R.id.temp_input);
        res = (TextView) findViewById(R.id.Final_result);
    }

    public void convert(View view) {
        double t = Double.parseDouble(input.getText().toString());
        if(ctof.isChecked()) {

            temp = (1.8*t) + 32;

        }

        else if(ftoc.isChecked()) {
            temp = (t - 32)/1.8;

        }
        res.setText(String.format("%.2f",temp));

    }

}