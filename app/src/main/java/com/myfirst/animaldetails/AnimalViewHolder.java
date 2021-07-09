package com.myfirst.animaldetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private ConstraintLayout mCvAnimal;
    private ImageView mIvAnimal;
    private TextView mTvName;
    private TextView mTvSound;
    private TextView mTvType;

    public AnimalViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews();
    }

    private void initViews() {
        mCvAnimal = itemView.findViewById(R.id.cvAnimal);
        mIvAnimal = itemView.findViewById(R.id.ivAnimal);
        mTvName = itemView.findViewById(R.id.tvNameAnimal);
        mTvSound = itemView.findViewById(R.id.tvSoundAnimal);
        mTvType = itemView.findViewById(R.id.tvTypeAnimal);
    }

    public void setData(AnimalModel animalModel){
        mIvAnimal.setImageResource(animalModel.getAnimalImageId());
        mTvName.setText(animalModel.getAnimalName());
        mTvSound.setText(animalModel.getAnimalSound());
        mTvType.setText(animalModel.getAnimalType());
        mCvAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(animalModel.getAnimalName());
            }
        });
    }
}
