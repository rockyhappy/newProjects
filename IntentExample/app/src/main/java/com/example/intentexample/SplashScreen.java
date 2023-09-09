package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.intentexample.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent iNext = new Intent(SplashScreen.this,MainActivity.class);
        Animation rot = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        ImageView rupy=findViewById(R.id.Rupey_symbol);
        rupy.startAnimation(rot);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iNext);
                finish();
            }
        },4000);
    }
}