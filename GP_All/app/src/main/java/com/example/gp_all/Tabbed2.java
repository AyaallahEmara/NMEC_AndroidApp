package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Tabbed2 extends AppCompatActivity {
     TabLayout tab;
     ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed2);

        tab=findViewById(R.id.tabs1);
        viewPager=findViewById(R.id.viewpager1);

           getTabs();
    }
    public void getTabs()
    {
        final ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                viewPagerAdapter.addfragment(erafragment.getInstance(),"Era Info");
                viewPagerAdapter.addfragment(exhibits.getInstance(),"Era Exhibits");

                viewPager.setAdapter(viewPagerAdapter);
                tab.setupWithViewPager(viewPager);
            }
        });

    }
}