package com.example.coffehouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewOrderFood extends RecyclerView.Adapter<RecyclerViewOrderFood.MyViewHolder> {
    private Context context;
    private List<Model_Order> list;

    public RecyclerViewOrderFood(Context context, List< Model_Order > list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(R.layout.item_order,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewOrderFood.MyViewHolder holder, int position) {
        holder.img.setImageResource(list.get(position).getImage());
        holder.title.setText(list.get(position).getTitle());
        holder.money.setText(list.get(position).getMoney());
        holder.icon.setImageResource(list.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView title;
        TextView money;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            title = (TextView) itemView.findViewById(R.id.title);
            money = (TextView) itemView.findViewById(R.id.money);
            icon = (ImageView) itemView.findViewById(R.id.icon);
        }
    }
}
