package oopstutorial;

class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("The lion roars loudly.");
    }
}
public class New_1{
    public static void main(String[] args){
        Lion lion = new Lion();
        lion.eat();   
        lion.roar();  
    }
}