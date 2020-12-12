package com.example.coffehouse;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TinTuc extends Fragment {
    LinearLayout linearprofile_tintuc;
    Button bt_detail;
    TextView tichdiem, dathang,coupon,rewards,noti;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tin_tuc,container,false);
        addControl(v);
        return v;
    }

    public void addControl(View v) {
        tichdiem = v.findViewById(R.id.tichdiem);
        noti = v.findViewById(R.id.tv_noti);
        dathang = v.findViewById(R.id.dathang);
        coupon = v.findViewById(R.id.coupon);
        rewards = v.findViewById(R.id.rewards);
        bt_detail = v.findViewById(R.id.bt_detail);
        linearprofile_tintuc = v.findViewById(R.id.linearprofile_tintuc);

        noti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Noti.class);
                startActivity(intent);
            }
        });
        tichdiem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),TichDiem.class);
                startActivity(intent);
            }
        });
//        dathang.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),DatHang.class);
//                startActivity(intent);
//            }
//        });
        coupon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Coupon.class);
                startActivity(intent);
            }
        });
        rewards.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),rewards.class);
                startActivity(intent);
            }
        });
        linearprofile_tintuc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),profile.class);
                startActivity(intent);
            }
        });
        bt_detail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Detail_ChiTietUuDai.class);
                startActivity(intent);
            }
        });

    }
}