package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    private Toolbar toolbarMain;
    private ImageView IvPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarMain = findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbarMain);

        IvPerson = findViewById(R.id.iv_person);

        IvPerson.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this,PersonActivity.class);
            startActivity(intent);

        });
    }
}
