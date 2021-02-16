package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgessBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // xml에 있는 메모리에 올라오는 과정 = 인플레이트, 여기가 실행되야 pgb_loading가 null이 아님 이 위로는 null

        // pgb_loading 은 실행시에 메모리에 뜬다.
        // 실행전에 컴파일시에 틀이 저 친구를 R에 등록을 해줌
        mProgessBar = findViewById(R.id.pgb_loading);

        download(); // 3초 = UI스레드
    }

    private void download(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    // 다운로드 완료, 스프링 서버 요청 응답의 결과 (json)
                    mProgessBar.setVisibility(View.INVISIBLE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}