package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private Button btnAdd, btnMinus;
    private TextView tv_num;
    private Integer num;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        init();
        initSetting();
        initListener();

    }
    
    private void init(){
        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);
        tv_num = findViewById(R.id.tv_num);
    }

    private void initSetting(){     // 세팅 담당
        num = 1;
        tv_num.setText(num.toString()); // toString 할려면 int로 하면 안된다
    }
    
    private void initListener(){    // Listener 담당
        btnAdd.setOnClickListener(v -> {
            Log.d(TAG, "initListener: ");
            num = num + 1;
            tv_num.setText(num.toString());
        });

        btnMinus.setOnClickListener(v -> {
            Log.d(TAG, "initListener: ");
            num = num - 1;
            tv_num.setText(num.toString());
        });
    }
}