public class MainProgram {

    public static void main(String[] args) {

        Home home = new Home();
                Dog dog1 = new Dog();
                Dog dog2 = new Dog();
                Cat cat = new Cat();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows

        home.adoptPet(dog2);
        home.makeAllSounds();
// this prints:
// Dog barks
// Cat meows
// Dog barks
    }
}
