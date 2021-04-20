package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button BTN1;
    private Button BTN2;
    private Button BTN3;
    private Button BTN4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        BTN1 = (Button) findViewById(R.id.Btn1);
        BTN1.setEnabled(true);
        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(gameActivityIntent);
            }

        });
        BTN2 = (Button) findViewById(R.id.Btn1);
        BTN2.setEnabled(true);
        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(gameActivityIntent);
            }

        });
        BTN3 = (Button) findViewById(R.id.Btn1);
        BTN3.setEnabled(true);
        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(gameActivityIntent);
            }

        });
        BTN4 = (Button) findViewById(R.id.Btn1);
        BTN4.setEnabled(true);
        BTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(gameActivityIntent);
            }

        });
    }

}
