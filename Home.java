package com.company;

import java.util.ArrayList;

public class Home extends Animal{
    ArrayList<Animal>petStorage = new ArrayList<Animal>();

    void adoptPet(Cat cat){
        petStorage.add(cat);
        cat.sound();
    }
    void adoptPet(Dog dog){
        petStorage.add(dog);
        dog.sound();
    }
    void makeAllSounds(){

    }
}
