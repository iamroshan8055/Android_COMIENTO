package com.example.roshanpatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splash extends AppCompatActivity {

    private static int Start_Screen = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer(2 seconds) is over and it wiill redirect to main activity
                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);
            }
        }, Start_Screen);

    }
}