package com.app.revature.revaturepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {
    private View login;
    private View register;
    private View swipe;
    Button Login;
    Button Register;
    Button Swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

       login =(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Intent login=new Intent(SplashScreen.this,Login.class);
                startActivity(login);
            }
        });
        register=(Button) findViewById(R.id.button2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent register=new Intent(SplashScreen.this,Register.class);
                startActivity(register);
            }
        });


        /*login.setScaleX(0);
        login.setScaleY(0);
        login.animate().scaleX(1).scaleY(1).start();*/
        //animateSlide();



    }

    /*public void animateSlide()
    {

        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,0,// from x
                Animation.RELATIVE_TO_PARENT,0,// to x
                Animation.RELATIVE_TO_PARENT,2f,// to y
                Animation.RELATIVE_TO_PARENT,0);// from y
        translateAnimation.setDuration(1000);
        login.startAnimation(translateAnimation);
        register.startAnimation(translateAnimation);*/
    }



