package inheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars loudly!");
    }
}

public class  ZooApplication {
    public static void main(String[] args) {
        Lion simba = new Lion();
        simba.eat();
        simba.roar();
    }
}
