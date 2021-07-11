package com.example.recycleevening3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<view>arrayList=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecycleview();
    }

    private void setRecycleview() {
        Adapter view =new Adapter(arrayList);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(view);
    }

    private void buildData() {
        for (int i = 0; i < 50; i++) {
            arrayList.add(new view("Business", "64", "Microsoft", R.drawable.billgatesnow));
            arrayList.add(new view("Business", "56", "Amazon", R.drawable.feffbezosnow));
            arrayList.add(new view("Business", "31", "Masai School", R.drawable.prateeksuklanow));
        }
    }
    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
    }



    }
