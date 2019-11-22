package com.company;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        home.adoptPet(cat1);
        home.adoptPet(dog1);
        home.adoptPet(dog1);
        cat1.eats("betty");
        dog1.eats("jkgj");
    }
}

