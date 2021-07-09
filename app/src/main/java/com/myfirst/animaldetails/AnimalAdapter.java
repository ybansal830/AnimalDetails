package com.myfirst.animaldetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<AnimalModel> arrayList;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(ArrayList<AnimalModel> arrayList,ItemClickListener itemClickListener){
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull

    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_animal,parent,false);
        return new AnimalViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        AnimalModel animalModel= arrayList.get(position);
        holder.setData(animalModel);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
