package com.example.coffehouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Noti extends AppCompatActivity {
    ImageView img_close;
    private List<Model_Noti> list;
    private RecyclerView recyclerView;
    private RecyclerViewNoti RecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);
        addControls();
        addEvent();
    }
    private void addEvent() {
        createData();
    }

    private void createData() {
        Model_Noti listViewBean = new Model_Noti(R.drawable.coupon,"Ngại ra ngoài cứ để Nhà lo",R.drawable.ic_baseline_check_box_24,
                "Shipper giao món bạn thích tận nơi trong 30 phút",R.drawable.ic_baseline_check_box_24,"1 ly cũng giao",
                R.drawable.ic_baseline_check_box_24,
                "Free Ship","Thứ năm tuần trước lúc 11:01");
        list.add(listViewBean);listViewBean = new Model_Noti(R.drawable.coupon,"Bạn thích món nào nhất tại Nhà",R.drawable.ic_latte,
                "Cà phê sữa đậm đà",R.drawable.ic_orange,"Trà đào cam sả trứ danh",R.drawable.ic_milk,
                "Trà Oolong hạt sen thơm bùi"," Chủ nhật tuần trước lúc 11:01");
        list.add(listViewBean);
        RecyclerViewAdapter.notifyDataSetChanged();
    }

    public void addControls(){
        ImageView img_close=(ImageView) findViewById(R.id.close_noti);
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        recyclerView=findViewById(R.id.recyclerview_noti);
        list=new ArrayList<>();
        RecyclerViewAdapter = new RecyclerViewNoti(this,list);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mlayout);
        recyclerView.setAdapter(RecyclerViewAdapter);
    }
}