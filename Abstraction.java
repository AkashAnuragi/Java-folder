public class Abstraction {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.eat();
        // d1.walk();

        // Chicken h1 = new Chicken();
        // h1.eat();
        // h1.walk();

        // System.out.println(h1.color);

        BullDog B1 = new BullDog();
        // Animal -> Dog -> BullDog Constructor is called.
    }
}

abstract class Animal {
    String color;
    Animal(){
       System.out.println("Animal Constructor is Called..");
    }
     void eat() {
        System.out.println("Animal eats..");
     }

    abstract void walk();
}

class Dog extends Animal {

    Dog() { 
        System.out.println("Dog Constructor is Called.. ");
    }

    void ChangeColor() {
        color = "Black";
    }
    void walk() {
        System.out.println("They walk on 4 lags");
    }
}

class BullDog extends Dog { 
    BullDog(){
        System.out.println("Bulldog Constructor is Called..");
    }
}

class Chicken extends Animal {

    Chicken(){
        System.out.println(" Chicken Constructor is Called..");
    }

    void ChangeColor(){
        color = "White";
    }
    void walk() {
        System.out.println("They walk on 2 legs.");
    }
}