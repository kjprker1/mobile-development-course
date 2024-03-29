package com.example.loops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void countUp(View v) {
        Log.i("message", "In countUp method");

        int x = 0;

        // Now n apparently infinite while loop
        while (true) {

            // Add 1 to x each time
            x++;
            Log.i("x=", "" + x);

            if (x == 3) {
                // Get mr out of here
                break;
            }
        }
    }

    public void countDown(View v) {
        Log.i("message", "In countDown method");

        int x = 4;

        // Now an apparently infinite while loop
        while (true) {

            // Add 1 to x each time
            x--;
            Log.i("x=", "" + x);

            if (x == 1) {
                // Get mr out of here
                break;

            }

        }
    }
    public void nested(View v) {
        Log.i("message", "In nested method");

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > 0; j--) {

                Log.i("i =" + i, "j=" + j);
            }
        }
    }
}
