package com.example.uts_booking_hoote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.ic_launcher_foreground, R.drawable.yellowstar, R.drawable.yellowstar, R.drawable.yellowstar,
    R.drawable.yellowstar, R.drawable.yellowstar, R.drawable.yellowstar};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.booking_hotel);
        s2 = getResources().getStringArray(R.array.lokasi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}