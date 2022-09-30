package com.example.roshanpatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView txtTitle, txtDetails, txtPrice;
    Button btnBuy;
    RatingBar ratingBar;
    ImageView images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();


        txtTitle = findViewById(R.id.text_name);
        txtDetails = findViewById(R.id.text_desciption);
        ratingBar  = findViewById(R.id.text_rat);
        txtPrice = findViewById(R.id.text_price);
        images = findViewById(R.id.image_1);

        btnBuy = findViewById(R.id.btn_buy);

        String title = intent.getStringExtra("title");
        Integer image = intent.getIntExtra("image",-1);
        String description[] = intent.getStringArrayExtra("description");
        int price = intent.getIntExtra("price", 0);
        float rating = intent.getFloatExtra("star",-1);

        txtTitle.setText(title);
        String detail ="        ";
        for(int i=0; i<description.length;i++){
            detail = detail + description[i] +"\n\n";
        }
        txtDetails.setText(detail);
        ratingBar.setRating(rating);
        txtPrice.setText("$"+price);
        images.setImageResource(image);

        btnBuy.setOnClickListener(new View.OnClickListener() {
//            @Override
            public void onClick(View v) {
                Log.i("info","------Hello you have clicked Buy button------");

                Intent myIntent = new Intent(Display.this, Checkout.class);
                myIntent.putExtra("image",image);
                myIntent.putExtra("title",title);
                myIntent.putExtra("price", price);
                startActivity(myIntent);
            }
        });

    }
}