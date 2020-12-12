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
        list.add(new Model_Order(R.drawable.drink_matcha,"Matcha Latte","59",R.drawable.ic_plus,"Với màu xanh mát mắt " +
                "của bột trà Matcha, vị ngọt nhẹ nhàng, pha trộn cùng sữa tươi và lớp foam mềm mịn, Matcha Latte là thức uống yêu thích của " +
                "tất cả mọi người khi ghé The Coffee House."));
        list.add(new Model_Order(R.drawable.drink_cafedasay,"Trà cà phê đá xây","59",R.drawable.ic_plus,"Hấp dẫn trên " +
                "từng nấc hương vị, là nốt hương đầu thanh thoát của lớp cà phê espresso hảo hạng, tiếp theo sau đó là thanh vị tươi mát đọng " +
                "mãi nơi cuống họng bởi lớp trà oolong đi kèm - 1 vị cà phê mới lạ nhưng lại chiều lòng những tâm hồn yêu cà phê dù là khó tính " +
                "nhất."));
        list.add(new Model_Order(R.drawable.drink_phucbaotu,"Phúc bồn tử cam đá xay","69",R.drawable.ic_plus,"Tê tái ngay đầu lưỡi bởi sự mát lạnh của đá xay."+
                "Hòa quyện thêm hương vị chua chua, ngọt ngọt từ trái cam tươi và trái phúc bồn tử 100% tự nhiên, để cho ra một hương vị thanh mát, kích thích vị giác đầy thú vị ngay từ lần đầu thưởng thức." +
                "Lại thêm một lựa chọn mới cho \"team đá xay\" và \"team trái cây\", còn chần chờ gì nữa mà không thử ngay thôi!"));;
        list.add(new Model_Order(R.drawable.drink_traolongphucbontu,"Mousse Tiramisu","59",R.drawable.ic_plus,"Một sự kết hợp đầy hoàn hảo giữa thanh mát và bổ dưỡng." +
                "Lần đầu tiên Trà Oolong và trái \"Phúc Bồn Tử\" hoàn toàn tự nhiên, được các barista của chúng tôi kết hợp một cách tinh tế để tạo ra một dư vị hoàn toàn tươi mới." +
                "Nhấp ngay một ngụm là thấy mát lạnh ngay tức khắc, đọng lại mãi nơi cuốn họng là hương vị trà thơm lừng và vị ngọt thanh, chua dịu khó quên của trái phúc bồn tử."));
        list.add(new Model_Order(R.drawable.drink_maccca,"Trà sữa mắc ca trân châu trắng","49",R.drawable.ic_plus,"Mỗi " +
                "ngày với Nhà sẽ là điều tươi mới hơn với sữa hạt mắc ca thơm ngon, bổ dưỡng quyện cùng nền trà Oolong cho vị cân bằng, ngọt " +
                "dịu. Trân châu trắng giòn dai được thêm sẵn, mang lại cho bạn cảm giác \"đã\" trong từng ngụm, thoả cơn thèm trà sữa ngay."));
        list.add(new Model_Order(R.drawable.coffe3,"Trà Đen Macchiato","42",R.drawable.ic_plus,"Trà đen được ủ mới mỗi ngày" +
                ", giữ nguyên được vị chát mạnh mẽ đặc trửng của lá trà, phủ bên trên là lớp Macchiato 'homemade' bồng bềnh quyến rũ vị phô mai mặn mặn " +
                "mà béo béo"));
        list.add(new Model_Order(R.drawable.coffe3,"Cappucino","54",R.drawable.ic_plus,"Cappuccino được gọi là thức uống" +
                " 'một - phần - ba' - 1/3 Espresso, 1/3 Sữa nóng, 1/3 Foam."));
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