package com.example.todolistapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
//        assert actionBar != null;
//        actionBar.hide();
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences preferences = getSharedPreferences("userDetails", MODE_PRIVATE);
                String str = preferences.getString("message", "");
                if (str.equals("login")) {
                    startActivity(new Intent(SplashActivity.this, Home.class));
                    finish();
                }
                else{
                    startActivity(new Intent(SplashActivity.this, Login.class));
                    finish();
                }

            }
        }, 1000);
    }
}