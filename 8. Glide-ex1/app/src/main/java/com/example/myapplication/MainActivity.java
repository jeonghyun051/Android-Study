package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv_1);
        Glide
                .with(MainActivity.this)
                .load("https://picsum.photos/200/300")  // url주소
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(iv1);
    }
}
