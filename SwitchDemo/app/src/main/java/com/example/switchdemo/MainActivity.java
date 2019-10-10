package com.example.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String command = " go east";
         switch (command){

            case "go east":
                Log.i("Player:", "Player moves to East");
                break;

            case "go west":
                 Log.i("Player:", "Player moves to West");
                 break;

            case "go north":
                 Log.i("Player:", "Player moves to North");
                 break;

             case "go south":
                 Log.i("Player:", "Player moves to South");
                 break;

             case "take sword":
                 Log.i("Player:", "Takes the silver sword");
                 break;

             default:
                 Log.i("Message: ", "Sorry I don't speak Elfish");
                 break;

         }
    }
}
