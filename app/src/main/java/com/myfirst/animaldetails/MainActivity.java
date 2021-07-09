package com.myfirst.animaldetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView mRecyclerView;
    private ArrayList<AnimalModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        AnimalAdapter animalAdapter = new AnimalAdapter(arrayList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setAdapter(animalAdapter);
        mRecyclerView.setLayoutManager(gridLayoutManager);
    }

    private void setData() {
        arrayList = new ArrayList<>();
        for(int i=0;i<6;i++){
            arrayList.add(new AnimalModel(R.drawable.lion,"Mammal","Roar",
                    "Lion"));
            arrayList.add(new AnimalModel(R.drawable.tiger,"Mammal","Growl",
                    "Tiger"));
            arrayList.add(new AnimalModel(R.drawable.zebra,"Mammal","Neigh",
                    "Zebra"));
            arrayList.add(new AnimalModel(R.drawable.horse,"Mammal","Neigh",
                    "Horse"));
            arrayList.add(new AnimalModel(R.drawable.giraffe,"Mammal","Hum",
                    "Giraffe"));
        }
    }

    @Override
    public void onItemClick(String animalName) {
        Toast.makeText(this,animalName,Toast.LENGTH_SHORT).show();
    }
}