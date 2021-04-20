package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText NameInput;
    private Button mPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameInput =(EditText) findViewById(R.id.Input);
        mPlay = (Button) findViewById(R.id.Button1);
        mPlay.setEnabled(false);
        NameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPlay.setEnabled(s.toString().length()!= 0);

            }
            @Override
            public void afterTextChanged(Editable s) {

            }

        });
        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivityIntent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(gameActivityIntent);
            }
        });
    }
}
