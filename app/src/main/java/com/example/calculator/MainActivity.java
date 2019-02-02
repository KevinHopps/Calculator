package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button mEnter;
    private Keypad mKeypad = new Keypad();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnter = findViewById(R.id.enter);
        mEnter.setOnClickListener(mKeypad);
    }
}
