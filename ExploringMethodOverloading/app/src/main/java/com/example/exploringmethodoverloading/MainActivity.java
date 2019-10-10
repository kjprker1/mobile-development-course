package com.example.exploringmethodoverloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int anInt = 10;
        String aString = " I am a string";

        printStuff(anInt);
        printStuff (aString);
        printStuff (anInt, aString);

    }
    void printStuff (int myInt){
        Log.i ("info", "This is the int only version");
        Log.i ("info", "myInt = " + myInt);
    }
    void printStuff (String myString){
        Log.i ("info", "This is the String only version");
        Log.i ("info", "myString  ="+ myString);
    }
    void printStuff (int myInt, String myString){
        Log.i("info", "This is the combined int amd String version");
        Log.i("info ", "myInt = " + myInt);
        Log.i("info", "myString = " + myString);

    }

}

