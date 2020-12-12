package com.example.coffehouse;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewOrderFood extends RecyclerView.Adapter<RecyclerViewOrderFood.MyViewHolder> {
    private Context context;
    private List<Model_Order> list;
    public static Dialog productdetails;
    public static TextView totalmoney;
    public static Product_order product_order;

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
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                productdetails = new Dialog(context);
                productdetails.requestWindowFeature(Window.FEATURE_NO_TITLE);
                productdetails.setContentView(R.layout.dialog_product);
                TextView name = productdetails.findViewById(R.id.nameofproduct);
                TextView price = productdetails.findViewById(R.id.priceofproduct);
                ImageView image = productdetails.findViewById(R.id.imageofproduct);
                TextView description =productdetails.findViewById(R.id.descripton);
                totalmoney = productdetails.findViewById(R.id.totalmoney);
                TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                name.setText(list.get(position).getTitle());
                price.setText(list.get(position).getMoney());
                image.setImageResource(list.get(position).getImage());
                totalmoney.setText(list.get(position).getMoney());
                description.setText(list.get(position).getDescription());
                int priceofproduct =Integer.parseInt(list.get(position).getMoney());

                product_order = new Product_order();
                product_order.setPrice(priceofproduct);
                product_order.setQuantity(Integer.parseInt((String) numberofproduct.getText()));

                productdetails.findViewById(R.id.tru1_301).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(product_order.getQuantity()>1){
                            product_order.setQuantity(product_order.getQuantity()-1);
                        }
                        totalmoney.setText(String.valueOf(product_order.getTotalMoney()));
                        TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                        numberofproduct.setText(String.valueOf(product_order.getQuantity()) );
                        if (product_order.getQuantity()==1){
                            productdetails.findViewById(R.id.tru1_301).setClickable(false);
                        }
                    }
                });
                productdetails.findViewById(R.id.cong1_301).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        product_order.setQuantity(product_order.getQuantity()+1);
                        totalmoney.setText(String.valueOf(product_order.getTotalMoney()));
                        TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                        numberofproduct.setText(String.valueOf(product_order.getQuantity()) );
                        if (product_order.getQuantity()>1){
                            productdetails.findViewById(R.id.tru1_301).setClickable(true);
                        }
                    }
                });

                productdetails.findViewById(R.id.close_dialogmoney).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        productdetails.cancel();
                    }
                });
                productdetails.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        ImageView img;
        TextView title;
        TextView money;
        ImageView icon;
        private ItemClickListener itemClickListener;

        public ItemClickListener getItemClickListener() {
            return itemClickListener;
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            title = (TextView) itemView.findViewById(R.id.title);
            money = (TextView) itemView.findViewById(R.id.money);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),true);
            return true;
        }
    }
}
