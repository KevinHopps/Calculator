package com.example.calculator;

import android.view.View;
import android.widget.Button;

public class Keypad implements View.OnClickListener
{
    public Keypad()
    {

    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();
        int enterId = R.id.enter;
    }
}
