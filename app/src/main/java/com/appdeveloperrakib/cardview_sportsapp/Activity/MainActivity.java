package com.appdeveloperrakib.cardview_sportsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appdeveloperrakib.cardview_sportsapp.Adapter.CustomAdapter;
import com.appdeveloperrakib.cardview_sportsapp.Model.Sport;
import com.appdeveloperrakib.cardview_sportsapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1- Adapter View
    RecyclerView recyclerView;

    // 2- Data Source
    List<Sport> sportList;

    // 3- Adapter

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();


        Sport s1 = new Sport("Football",R.drawable.football);
        Sport s2 = new Sport("Basketball",R.drawable.basketball);
        Sport s3 = new Sport("Tennis",R.drawable.tennis);
        Sport s4 = new Sport("VolleyBall",R.drawable.volley);
        Sport s5 = new Sport("Ping Pong",R.drawable.ping);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);

        adapter = new CustomAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);








    }
}