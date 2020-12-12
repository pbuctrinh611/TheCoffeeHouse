package com.example.coffehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Order_Drink extends Fragment {
    private List<Model_Order> list;
    RecyclerView rcv;
    private RecyclerViewOrderFood RecyclerViewAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_order__drink, container, false);
        addControls(v);
        loadData();
        loadListNotification();
        return v;
    }
    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model_Order(R.drawable.food_banhbonglan,"Bông Lan Trứng Muối","29.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.food_banhmi,"Bánh Mì Chà Bông","32.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.food_mochichocolate,"Mochi Kem Chocolate","19.000đ",R.drawable.ic_plus));;
        list.add(new Model_Order(R.drawable.food_banhtira,"Mousse Tiramisu","32.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.food_banhgau,"Mousse Gấu Chocolate","32.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.food_gaxelachanh,"Gà Xé Lá Chanh","25.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.food_mitsay,"Mít Sấy","20.000đ",R.drawable.ic_plus));
    }
    public void addControls(View v){
        rcv = v.findViewById(R.id.gridview_drink);
    }
    public void loadListNotification(){
        RecyclerViewOrderFood myAdapter = new RecyclerViewOrderFood(getActivity(),list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(myAdapter);
    }
}