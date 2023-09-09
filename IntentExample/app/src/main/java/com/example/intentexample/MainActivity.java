package com.example.intentexample;

import android.content.Intent;
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

import com.example.intentexample.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext;
        btnNext=findViewById(R.id.btnnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent iNext= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(iNext);

            }
        });
    }
}