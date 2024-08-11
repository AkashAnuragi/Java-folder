// Run time Polymorphism.

// mehtod overridding.
public class Polymorphism02 {
    public static void main(String[] args) {
        Goat g1 = new Goat();
        g1.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("they will eats anuything.");
    }
}

class Goat extends Animal {
    void eat(){
        System.out.println(" it eats Grass.");
    }
}
