package com.app.revature.revaturepro;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SwipeOptions extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_options);
        viewPager=(ViewPager) findViewById(R.id.view_pager);
        SwipeAdapter swipeAdapter=new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter);


    }
}
