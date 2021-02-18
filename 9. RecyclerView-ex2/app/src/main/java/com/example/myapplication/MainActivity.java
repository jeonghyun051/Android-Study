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

        List<Note> notes = new ArrayList<>();
        notes.add(new Note(1,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",15));
        notes.add(new Note(2,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",23));
        notes.add(new Note(3,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",43));
        notes.add(new Note(4,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",56));
        notes.add(new Note(5,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",13));
        notes.add(new Note(6,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",34));
        notes.add(new Note(7,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",17));
        notes.add(new Note(8,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",68));
        notes.add(new Note(9,"All Connors Brunch this weekend?", "I`ll Be in your neighsadf",37));


        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvUserList = findViewById(R.id.rv_user_list);
        rvUserList.setLayoutManager(manager);
        userAdapter = new UserAdapter(notes);

        rvUserList.setAdapter(userAdapter);
    }
}
