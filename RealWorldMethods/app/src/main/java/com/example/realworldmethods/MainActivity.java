package com.example.realworldmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String result=joinThese("Methods","Are", "Cool");
        Log.i("Info", "result = " + result);

        float area=getAreaCircle (5f);
        Log.e("area = ", ""+ area);
    }

    public String joinThese (String a, String b, String c){
        return a + b + c;
    }
    public float getAreaCircle( float radius){
       return 3.14f * radius * radius;
    }
    void changeA(int a)

            int a = 0;
    {

    }
}
