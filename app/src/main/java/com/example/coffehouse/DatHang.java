package com.example.coffehouse;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class DatHang extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    public PageAdapter pageAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dat_hang,container,false);
        addControls(v);
        createTabFragment();
        return v;
    }
    public void createTabFragment() {
        pageAdapter = new PageAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        pageAdapter.addFragment(new Order_Popular());
        pageAdapter.addFragment(new Order_Drink());
        pageAdapter.addFragment(new Order_Food());
        viewPager.setAdapter(pageAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                pageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.postDelayed(
                new Runnable(){
                    @Override
                    public void run() {
                        tabLayout.getTabAt(0).select();
                    }
                }, 1);
    }
    public void addControls(View v) {
        tabLayout = (TabLayout) v.findViewById(R.id.tab_history);
        viewPager = (ViewPager) v.findViewById(R.id.view_page_order);
    }
}