package com.example.roshanpatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    public CardView card_Ind1, card_Ita1, card_Sea1, card_Fas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card_Ind1=(CardView) findViewById(R.id.card_Ind);
        card_Ita1=(CardView) findViewById(R.id.card_Ita);
        card_Sea1=(CardView) findViewById(R.id.card_Sea);
        card_Fas1=(CardView) findViewById(R.id.card_Fas);

        card_Ind1.setOnClickListener(this);
        card_Ita1.setOnClickListener(this);
        card_Sea1.setOnClickListener(this);
        card_Fas1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()){
            case R.id.card_Ind:
                i=new Intent(this,Indian_Food.class);
                startActivity(i);
                break;

            case R.id.card_Ita:
                i=new Intent(this,Italian_Food.class);
                startActivity(i);
                break;

            case R.id.card_Sea:
                i=new Intent(this,Sea_Food.class);
                startActivity(i);
                break;

            case R.id.card_Fas:
                i=new Intent(this,Fast_Food.class);
                startActivity(i);
                break;
        }

    }
}