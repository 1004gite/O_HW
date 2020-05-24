package com.example.myweatherapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            String data = getIntent().getStringExtra("data");
            DetailFragment fragment = new DetailFragment(data);

            getSupportFragmentManager().beginTransaction().add(R.id.detail_container, fragment).commit();
        }

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
