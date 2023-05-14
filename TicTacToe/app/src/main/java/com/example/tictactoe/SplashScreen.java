package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity
{

    Intent in;
    Animation animation1;
    ImageView imageView1;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        in = new Intent(SplashScreen.this,MainActivity.class);

        new Handler().postDelayed(()->
        {
            startActivity(in);
            finish();

        }
        ,3000);

        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anime_logo);
        imageView1 = findViewById(R.id.ImageViewLogo);
        imageView1.setAnimation(animation1);

    }
}