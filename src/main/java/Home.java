import java.util.ArrayList;

class Home extends Animal{
    private ArrayList<Animal>petStorage = new ArrayList<Animal>();

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
