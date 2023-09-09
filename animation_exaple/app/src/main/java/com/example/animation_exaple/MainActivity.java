package com.example.animation_exaple;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.animation_exaple.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1;
        txt1=findViewById(R.id.txt1);
        Button translate ,rotate,alpha,resize;
        translate=findViewById(R.id.btntranslate);
        rotate=findViewById(R.id.btnrotate);
        alpha=findViewById(R.id.btnalpha);
        resize=findViewById(R.id.btnresize);
        translate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Animation move= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                txt1.startAnimation(move);
            }
        });
        alpha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Animation alfa=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txt1.startAnimation(alfa);

            }
        });
        rotate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Animation rot = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txt1.startAnimation(rot);
            }
        });
        resize.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Animation size = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.resize);
                txt1.startAnimation(size);
            }
        });
    }
}
