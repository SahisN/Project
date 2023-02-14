package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager2 viewPager2;


    private String[] titles={"Food", "Drinks"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        viewPager2 = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tab_layout);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);


        new TabLayoutMediator(tabLayout, viewPager2, (((tab, position) ->  tab.setText(titles[position])))).attach();
        //FoodFragment foodFragment = (FoodFragment) getSupportFragmentManager().findFragmentById(R.id.food_fragment);





    }
}