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
        list.add(new Model_Order(R.drawable.coffe1,"Cà phê Lúa Mạch Đá","69",R.drawable.ic_plus,"Yêu chiều bản" +
                " thân cùng hương vị ngọt ngào, được cân chỉnh hợp lý sô cô la mát lạnh, lúa mạch thơm lừng. " +
                "Vị giáng sinh hoàn hảo dành cho bạn, Order liền thôi!"));;
        list.add(new Model_Order(R.drawable.coffe_nong,"Cà phê Lúa Mạch Nóng","69",R.drawable.ic_plus,"1 tách cà phê " +
                "đặc biệt cho mùa đặc biệt nhất năm. Lúa mạch thơm lừng kết hợp cùng cà phê đượm vị. Thưởng thúc vị Giáng sinh giành riêng" +
                "cho bạn hôm nay nhé."));
        list.add(new Model_Order(R.drawable.coffe2,"Cold Brew Cam Sả","50",R.drawable.ic_plus,"Tươi mát - Mượt mà" +
                ", là sự kết hợp đầy mới mẻ khí hương vị của cam và sả được cân bằng trên nền của những nốt hương cà phê pha lạnh."));
        list.add(new Model_Order(R.drawable.coffe3,"Trà Đen Macchiato","42",R.drawable.ic_plus,"Trà đen được ủ mới mỗi ngày" +
                ", giữ nguyên được vị chát mạnh mẽ đặc trửng của lá trà, phủ bên trên là lớp Macchiato 'homemade' bồng bềnh quyến rũ vị phô mai mặn mặn " +
                "mà béo béo"));
        list.add(new Model_Order(R.drawable.coffe_bacsiu,"Bạc Sỉu","32",R.drawable.ic_plus,"Theo chân những người gốc Hoa đến" +
                "định của tại Sài Gòn, Bạc sỉu là cách gọi tắt của 'Bạc tày xỉu phé' trong tiếng Quảng Đông, chính là : Ly sữa trắng kèm một chút cà phê"));
        list.add(new Model_Order(R.drawable.coffe_sua,"Cà Phê Sữa","32",R.drawable.ic_plus,"Cà phê phin kết hợp cùng sữa đặc" +
                " là một sáng tạo đầy tự hào của người Việt, được xem món uống thương hiệu của Việt Nam."));
        list.add(new Model_Order(R.drawable.coffe_den,"Cà phê Đen","32",R.drawable.ic_plus,"Một tách cà phê đen thơm ngào ngạt" +
                ", phảng phất mùi cacao là món quà tự thưởng tuyệt vời nhất cho những ai mê đắm tinh chất nguyên bản chất của cà phê. Một tách cà phê" +
                "Một tách cà phê trầm lắng, thi vị giữa dòng đời vỗn vã."));
        list.add(new Model_Order(R.drawable.coffe3,"Cappucino","54",R.drawable.ic_plus,"Cappuccino được gọi là thức uống" +
                " 'một - phần - ba' - 1/3 Espresso, 1/3 Sữa nóng, 1/3 Foam."));
    }
    public void addControls(View v){
        rcv = v.findViewById(R.id.gridview_popular);
    }

    public void loadListNotification(){
        RecyclerViewOrderFood myAdapter = new RecyclerViewOrderFood(getActivity(),list);
        rcv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rcv.setAdapter(myAdapter);
    }
}