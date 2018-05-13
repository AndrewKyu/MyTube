package com.example.andrewkyu.mytube;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MyTubeHome extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tube_home);


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView_Main);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //We'll put all data that we need to display into recyclerView
        listItems = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            ListItem listItem = new ListItem(
                    "heading" + (i+1),
                    "test data",
                    "asdf",
                    "asdfasdf"
            );
            listItems.add(listItem);
        }
        mAdapter = new MyTubeAdapter(listItems, this); //it will take the list items and context as parameters
        mRecyclerView.setAdapter(mAdapter);
    }


}

