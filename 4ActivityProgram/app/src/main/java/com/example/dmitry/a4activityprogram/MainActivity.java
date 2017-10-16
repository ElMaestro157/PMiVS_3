package com.example.dmitry.a4activityprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button2: {
                Intent i = new Intent(MainActivity.this, activity3.class);
                startActivity(i);
                break;
            }
            case R.id.button3: {
                Intent i = new Intent(MainActivity.this, activity4.class);
                startActivity(i);
                break;
            }
            case R.id.button4: {
                System.exit(0);
            }
        }
    }
}
