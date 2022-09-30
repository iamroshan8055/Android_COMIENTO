package com.example.roshanpatel_individualproject;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<products> mDataset;

    MyAdapter(ArrayList<products> foodList){
        mDataset = foodList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){

        products dish = mDataset.get(position);

        holder.name.setText(dish.getFood_name());
        holder.image.setImageResource(Integer.parseInt((String.valueOf(dish.getFood_image()))));
        holder.price.setText("$"+dish.getFood_price());
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name,price;
        ImageView image;

        MyViewHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.products, parent, false));
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.text_1);
            image=itemView.findViewById(R.id.image_1);
            price=itemView.findViewById(R.id.text_2);
        }
            public void onClick(View view) {
            int position = getLayoutPosition();
            products selected = mDataset.get(position);

            Intent intent = new Intent(this.itemView.getContext(), com.example.roshanpatel_individualproject.Display.class);
            Log.i("info","------Hello you have clicked------");
            intent.putExtra("title", selected.getFood_name());
            intent.putExtra("image",selected.getFood_image());
            intent.putExtra("price", selected.getFood_price());
            intent.putExtra("star", selected.getFood_star());
            intent.putExtra("description",selected.getFood_description());
            this.itemView.getContext().startActivity(intent);

        }
    }

}
