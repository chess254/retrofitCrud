package com.chess254.retrofitcrud;

import android.content.Context;
import android.graphics.ColorSpace;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by chess on 10/7/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{

    private List<Calories> calories;
    private Context context;

    public RecyclerAdapter(List<Calories> calories, Context context){
        this.calories = calories;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout, parent, false);

        return  new MyViewHolder((view));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(calories.get(position).getName());
        holder.Calories.setText("CAlories: " + Integer.toString(calories.get(position).getCalories()));
        Glide.with(context).load(calories.get(position).getImage_Path()).into(holder.Img);
    }

    @Override
    public int getItemCount() {
        return calories.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView Img;
        TextView Name, Calories;

        public MyViewHolder(View itemView) {
            super(itemView);

            Img = (ImageView) itemView.findViewById(R.id.img);
            Name = (TextView) itemView.findViewById(R.id.name);
            Calories = (TextView) itemView.findViewById(R.id.calories);
        }
    }
}
