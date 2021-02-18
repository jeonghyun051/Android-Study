package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvUserList;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<>();
        for (int i=1; i<50; i++){
            users.add(new User(i,"user"+i));
        }

        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvUserList = findViewById(R.id.rv_user_list);
        rvUserList.setLayoutManager(manager);
        userAdapter = new UserAdapter(users);

        rvUserList.setAdapter(userAdapter);
    }
}
