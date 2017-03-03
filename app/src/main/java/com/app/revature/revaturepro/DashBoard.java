package com.app.revature.revaturepro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DashBoard extends AppCompatActivity {
private ImageView java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    }


        public void slide(View view){
            ImageView image = (ImageView)findViewById(R.id.imageView);
            Animation slide= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
            image.startAnimation(slide);




        }

    }
