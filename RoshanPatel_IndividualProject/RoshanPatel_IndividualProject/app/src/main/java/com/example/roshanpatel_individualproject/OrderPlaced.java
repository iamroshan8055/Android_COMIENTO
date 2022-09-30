package com.example.roshanpatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderPlaced extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_placed);

        display = findViewById(R.id.txt_HolderDisplay);
        Intent myIntent = getIntent();
        String name = myIntent.getStringExtra("NAME");

        display.setText(name);
    }
}