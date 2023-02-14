package com.example.app;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

     private String[] titles={"Food", "Drinks"};




    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new FoodFragment();

            case 1:
                return new DrinkFragment();
        }
        return new FoodFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
