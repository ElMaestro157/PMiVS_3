package com.example.dmitry.a4activityprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
    }

    public void onClick(View v) {
        Button b = (Button)v;
        b.setBackgroundColor(getResources().getColor(R.color.colorChange));
        //b.setBackground(getResources().getDrawable(R.drawable.roundablebutton));
    }
}
