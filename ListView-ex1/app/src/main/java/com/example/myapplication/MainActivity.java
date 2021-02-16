package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private Context mContext = MainActivity.this;
    private ListView lvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // xml에 있는 그림이 메모리에 올라오는 과정 = 인플레이트

        lvMovie = findViewById(R.id.lv_movie);

        // 어댑터 => 내장 어댑터 (간단한 디자인의 리스트)
        // 어댑터를 직접 만들어야 되는 경우 (커스텀 리스트 만들 때)

        List<String> mid = new ArrayList<>();
        mid.add("가쉽걸");
        mid.add("덱스터");
        mid.add("왕좌의게임");
        mid.add("브레이킹배드");
        mid.add("게임3");

        // 어댑터는 화면 사이즈와 리스트의 하나의 아이템의 사이즈를 알야하고 그 다음에 데이터 컬렉션을 알아야 한다.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(mContext, android.R.layout.simple_list_item_1,mid); // 디자인을 알아야 높이를 계산할 수 있음

        lvMovie.setAdapter(adapter);

        mid.add("테이큰");
    }
}