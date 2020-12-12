package com.example.coffehouse;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewNoti extends RecyclerView.Adapter<RecyclerViewNoti.MyViewHolder> {
    private Context context;
    private List<Model_Noti> list;
    private static Dialog dialog_noti;

    public RecyclerViewNoti(Context context, List< Model_Noti > list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerViewNoti.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(R.layout.item_noti,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewNoti.MyViewHolder holder, int position) {
        holder.img_noti.setImageResource(list.get(position).getImg_noti());
        holder.title.setText(list.get(position).getTitle());
        holder.img_noti1.setImageResource(list.get(position).getImg_noti1());
        holder.tv_noti1.setText(list.get(position).getTv_noti1());
        holder.img_noti2.setImageResource(list.get(position).getImg_noti2());
        holder.tv_noti2.setText(list.get(position).getTv_noti2());
        holder.img_noti3.setImageResource(list.get(position).getImg_noti3());
        holder.tv_noti3.setText(list.get(position).getTv_noti3());
        holder.tv_bottom.setText(list.get(position).getTv_bottom());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                dialog_noti = new Dialog(context);
                dialog_noti.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog_noti.setContentView(R.layout.dialog_noti);
                TextView title = dialog_noti.findViewById(R.id.tv_titleNotiSub);
                ImageView img_noti1 = dialog_noti.findViewById(R.id.img_notiSub1);
                TextView tv_noti1 = dialog_noti.findViewById(R.id.tv_notiSub1);
                ImageView img_noti2 = dialog_noti.findViewById(R.id.img_notiSub2);
                TextView tv_noti2 = dialog_noti.findViewById(R.id.tv_notiSub2);
                ImageView img_noti3 = dialog_noti.findViewById(R.id.img_notiSub3);
                TextView tv_noti3 = dialog_noti.findViewById(R.id.tv_notiSub3);
                title.setText(list.get(position).getTitle());
                img_noti1.setImageResource(list.get(position).getImg_noti1());
                tv_noti1.setText(list.get(position).getTv_noti1());
                img_noti2.setImageResource(list.get(position).getImg_noti2());
                tv_noti2.setText(list.get(position).getTv_noti2());
                img_noti3.setImageResource(list.get(position).getImg_noti3());
                tv_noti3.setText(list.get(position).getTv_noti3());
                dialog_noti.show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        ImageView img_noti;
        TextView title;
        ImageView img_noti1;
        TextView tv_noti1;
        ImageView img_noti2;
        TextView tv_noti2;
        ImageView img_noti3;
        TextView tv_noti3;
        TextView tv_bottom;
        private ItemClickListener itemClickListener;

        public ItemClickListener getItemClickListener() {
            return itemClickListener;
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public MyViewHolder(View itemView) {
            super(itemView);
            img_noti = (ImageView) itemView.findViewById(R.id.img_noti);
            title = (TextView) itemView.findViewById(R.id.tv_title_noti);
            img_noti1 = (ImageView) itemView.findViewById(R.id.img_noti1);
            tv_noti1 = (TextView) itemView.findViewById(R.id.tv_noti1);
            img_noti2 = (ImageView) itemView.findViewById(R.id.img_noti2);
            tv_noti2 = (TextView) itemView.findViewById(R.id.tv_noti2);
            img_noti3 = (ImageView) itemView.findViewById(R.id.img_noti3);
            tv_noti3 = (TextView) itemView.findViewById(R.id.tv_noti3);
            tv_bottom = (TextView) itemView.findViewById(R.id.tv_bottom);
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
