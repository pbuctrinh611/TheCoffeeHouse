package com.example.coffehouse;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TaiKhoan extends Fragment {
    TextView tv_caidat,tv_tttk;
    LinearLayout linear_profile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tai_khoan,container,false);
        addControl(v);
        return v;
    }

    public void addControl(View v) {
        tv_caidat = v.findViewById(R.id.tv_caidat);
        tv_tttk = v.findViewById(R.id.tv_tttk);
        linear_profile = v.findViewById(R.id.linear_profile);

        tv_caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CaiDat.class);
                startActivity(intent);
            }
        });
        tv_tttk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),profile.class);
                startActivity(intent);
            }
        });
        linear_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),profile.class);
                startActivity(intent);
            }
        });
    }
}