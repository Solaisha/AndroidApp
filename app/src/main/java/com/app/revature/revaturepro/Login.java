package com.app.revature.revaturepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView forgot_password= (TextView) findViewById(R.id.txt_forgot_password);

        forgot_password.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
               Intent forgot_password=new Intent(Login.this,ForgotPassword.class);
                startActivity(forgot_password);
                return false;
            }
        });

        TextView register_here=(TextView) findViewById(R.id.txt_register_here);

        register_here.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                Intent register_here=new Intent(Login.this,Register.class);
                startActivity(register_here);
                return true;
            }
        });

        Button login = (Button) findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,SliderView.class);
                startActivity(intent);
            }
        });
    }
}
