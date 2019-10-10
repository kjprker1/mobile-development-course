package com.example.kevinparkerassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x = 0;
    }

    public void countUp(View v) {
        Log.i("message:", "In countUp method");

        while (true) {
            //Add 1 to x each time
            x++;
            Log.i("x =","" + x);

            if (x <= 0 || x >= 10) ;
            Log.i("message:","Enter a number from 1 to 10");

            break;
             }
        }

    public void countDown(View v) {
        Log.i("message:", "In countDown method");

        while (true) {
            //Take 1 away from x each time
            x--;
            Log.i("x =", "" + x);

            if (x <= 0 || x >= 10) ;
            Log.i("message:","Enter a number from 1 to 10");

           break;

        }

    }
}



