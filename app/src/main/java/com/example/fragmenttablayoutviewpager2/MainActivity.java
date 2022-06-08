package com.example.fragmenttablayoutviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private String[] titles = new String[]{"Chat", "Status", "Call"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
//        getSupportActionBar().hide();

        //binding
        TabLayout tabLayout = findViewById(R.id.tab_layout_TL);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager_VP2);

        //set adapter for viewPager2
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);

        //show names on fragment Tabs Layout
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(titles[position])).attach();
    }
}