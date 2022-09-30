package com.example.roshanpatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Fast_Food extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<products> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        products fd1=new products();
        fd1.setFood_name("Spring Roll");
        fd1.setFood_image(R.drawable.food_png_1);
        fd1.setFood_star(3.8f);
        fd1.setFood_price(15);
        fd1.setFood_description(new String[]{"150 calories","Delicious!", "This authentic Inian food will give you full ride of Indian taste palate. This dish is popular among all the youngsters"});

        products fd2=new products();
        fd2.setFood_name("Pasta");
        fd2.setFood_image(R.drawable.food_png_7);
        fd2.setFood_star(4.2f);
        fd2.setFood_price(12);
        fd2.setFood_description(new String[]{"150 calories","Delicious!", "This authentic Inian food will give you full ride of Indian taste palate. This dish is popular among all the youngsters"});

        products fd3=new products();
        fd3.setFood_name("Burger");
        fd3.setFood_image(R.drawable.food_png_29);
        fd3.setFood_star(5f);
        fd3.setFood_price(8);
        fd3.setFood_description(new String[]{"150 calories","Delicious!", "This authentic Inian food will give you full ride of Indian taste palate. This dish is popular among all the youngsters"});

        foodList.add(fd1);
        foodList.add(fd2);
        foodList.add(fd3);

        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(foodList);
        recyclerView.setAdapter(mAdapter);
    }
}