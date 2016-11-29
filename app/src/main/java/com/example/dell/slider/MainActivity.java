package com.example.dell.slider;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    private static int currentpage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        final SwipeAdapter swipeAdapter=new SwipeAdapter(getSupportFragmentManager());

        viewPager.setAdapter(swipeAdapter);
        CircleIndicator indicator =(CircleIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentpage=position;

            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });


    }
}
