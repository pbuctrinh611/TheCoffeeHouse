package com.example.coffehouse;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Order_Popular extends Fragment {
    private List<Model_Order> list;
    RecyclerView rcv;
//    LinearLayout dialog_product;
    private RecyclerViewOrderFood RecyclerViewAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_order__popular, container, false);
        addControls(v);
        loadData();
        loadListNotification();
        return v;
    }


    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model_Order(R.drawable.coffe1,"Cà phê Lúa Mạch Đá","69.000đ",R.drawable.ic_plus));;
        list.add(new Model_Order(R.drawable.coffe_nong,"Cà phê Lúa Mạch Nóng","69.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe2,"Cold Brew Cam Sả","50.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe3,"Trà Đen Macchiato","42.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe_bacsiu,"Bạc Sỉu","32.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe_sua,"Cà Phê Sữa","32.000đđ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe_den,"Cà phê Đen","32.000đ",R.drawable.ic_plus));
        list.add(new Model_Order(R.drawable.coffe3,"Cappucino","54.000đ",R.drawable.ic_plus));
    }
    public void addControls(View v){
        rcv = v.findViewById(R.id.gridview_popular);
//        dialog_product = v.findViewById(R.id.dialog_product);
//        dialog_product.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DialogProduct();
//            }
//        });
    }
//    private void DialogProduct() {
//        Dialog dialog = new Dialog(getActivity());
//        dialog.show();
//    }
    public void loadListNotification(){
        RecyclerViewOrderFood myAdapter = new RecyclerViewOrderFood(getActivity(),list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(myAdapter);
    }
}