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

public class Order_Food extends Fragment {
    private List<Model_Order> list;
    RecyclerView rcv;
    private RecyclerViewOrderFood RecyclerViewAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_order__food, container, false);
        addControls(v);
        loadData();
        loadListNotification();
        return v;
    }
    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model_Order(R.drawable.food_banhbonglan,"Bông Lan Trứng Muối","29",R.drawable.ic_plus,"Chắc chắn " +
                "bạn sẽ không thể cưỡng lại chiếc bánh bông lan tơi xốp, mềm mịn, vị ngọt dịu kết hợp với trứng muối và chà bông đậm đà, " +
                "cân bằng vị giác."));
        list.add(new Model_Order(R.drawable.food_banhmi,"Bánh Mì Chà Bông","32",R.drawable.ic_plus,"Bạn không " +
                "thể bỏ lỡ chiếc bánh với lớp phô mai vàng sánh mịn bên trong, được bọc ngoài lớp vỏ xốp mềm thơm lừng. Thêm lớp chà bông mằn " +
                "mặn hấp dẫn bên trên."));
        list.add(new Model_Order(R.drawable.food_mochichocolate,"Mochi Kem Chocolate","19",R.drawable.ic_plus,"Cảm nhận " +
                "hương vị Á Âu từ lớp vỏ nếp sô cô la ngọt dẻo, đến lớp kem lạnh và sốt sô cô la bên trong. Cắn 1 miếng là mê ngay."));;
        list.add(new Model_Order(R.drawable.food_banhtira,"Mousse Tiramisu","32",R.drawable.ic_plus,"Hương vị dễ ghiền được " +
                "tạo nên bởi chút đắng nhẹ của cà phê, lớp kem trứng béo ngọt dịu hấp dẫn."));
        list.add(new Model_Order(R.drawable.food_banhgau,"Mousse Gấu Chocolate","32",R.drawable.ic_plus,"Với vẻ ngoài đáng yêu " +
                "và hương vị ngọt ngào, thơm béo nhất định bạn phải thử ít nhất 1 lần."));
        list.add(new Model_Order(R.drawable.food_gaxelachanh,"Gà Xé Lá Chanh","25",R.drawable.ic_plus,"Thịt gà được xé tơi, vị mặn, " +
                "ngọt và cay quyện nhau vừa chuẩn, thêm chút thơm thơm từ lá chanh sấy khô giòn giòn nữa thì cơn buồn miệng nào cũng sẽ bị xua tan."));
        list.add(new Model_Order(R.drawable.food_mitsay,"Mít Sấy","20",R.drawable.ic_plus,"Mít sấy khô vàng ươm" +
                " giòn rụm, khi ăn vẫn giữ nguyên được vị ngọt lịm của mít tươi."));
    }
    public void addControls(View v){
        rcv = v.findViewById(R.id.gridview_food);
    }
    public void loadListNotification(){
        RecyclerViewOrderFood myAdapter = new RecyclerViewOrderFood(getActivity(),list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(myAdapter);
    }
}