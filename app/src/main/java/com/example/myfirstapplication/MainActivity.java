package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Number1 = findViewById(R.id.Number1);
        EditText Number2 = findViewById(R.id.Number2);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button times = findViewById(R.id.times);
        Button divide = findViewById(R.id.divide);
        TextView Res = findViewById(R.id.textView2);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double i;
                Double j;
                try {
                    j = Double.parseDouble(String.valueOf(Number2.getText()));
                } catch( Exception e) {
                    j = 0.0;
                }
                try {
                    i = Double.parseDouble(String.valueOf(Number1.getText()));
                } catch( Exception e) {
                    i = 0.0;
                }
            Double r = i + j;
            Res.setText(String.valueOf(r));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double i;
                Double j;
                try {
                    j = Double.parseDouble(String.valueOf(Number2.getText()));
                } catch( Exception e) {
                    j = 0.0;
                }
                try {
                    i = Double.parseDouble(String.valueOf(Number1.getText()));
                } catch( Exception e) {
                    i = 0.0;
                }
                Double r = i - j;
                Res.setText(String.valueOf(r));
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double i;
                Double j;
                try {
                    j = Double.parseDouble(String.valueOf(Number2.getText()));
                } catch( Exception e) {
                    j = 0.0;
                }
                try {
                    i = Double.parseDouble(String.valueOf(Number1.getText()));
                } catch( Exception e) {
                    i = 0.0;
                }
                Double r = i * j;
                Res.setText(String.valueOf(r));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double i;
                Double j;
                try {
                    j = Double.parseDouble(String.valueOf(Number2.getText()));
                } catch( Exception e) {
                    j = 0.0;
                }
                try {
                    i = Double.parseDouble(String.valueOf(Number1.getText()));
                } catch( Exception e) {
                    i = 0.0;
                }
                Double r = i / j;
                Res.setText(String.valueOf(r));
            }
        });
    }
}