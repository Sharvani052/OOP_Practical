package inheritance;

class Animal1 {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal1 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps softly.");
    }
}

public class PetManagement {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // from Animal
        myPuppy.bark(); // from Dog
        myPuppy.weep(); // from Puppy
    }
}
