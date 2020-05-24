package com.example.myweatherapp;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

            DetailFragment fragment = new DetailFragment(getIntent().getStringExtra("data"));

            getSupportFragmentManager().beginTransaction().add(R.id.detail_container, fragment).commit();

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
