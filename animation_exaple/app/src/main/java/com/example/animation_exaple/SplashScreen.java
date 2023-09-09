package com.example.animation_exaple;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.animation_exaple.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent iNext = new Intent(SplashScreen.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iNext);
                finish();
            }
        }, 4000);
    }
}