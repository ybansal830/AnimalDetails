package com.myfirst.animaldetails;

public class AnimalModel {
    private int AnimalImageId;
    private String AnimalType;
    private String AnimalSound;
    private String AnimalName;

    public AnimalModel(int animalImageId, String animalType, String animalSound, String animalName) {
        AnimalImageId = animalImageId;
        AnimalType = animalType;
        AnimalSound = animalSound;
        AnimalName = animalName;
    }

    public int getAnimalImageId() {
        return AnimalImageId;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public String getAnimalSound() {
        return AnimalSound;
    }

    public String getAnimalName() {
        return AnimalName;
    }
}
