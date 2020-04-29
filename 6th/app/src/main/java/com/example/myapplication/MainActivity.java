package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //클릭하면 github사이트로
    public  void click(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://1004gite.github.io"));
        startActivity(intent);
    }

}
