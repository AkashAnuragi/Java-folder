 // Multilevel Inheritance.

public class Multilevel_Inheritance {
public static void main(String[] args) {
    Dog doggy = new Dog();
    doggy.eat();
    doggy.leg = 4;
    System.out.println(doggy.leg);
}    
}

class Animal {
    String color;

    void eat() {
        System.out.println("They  can eat..");
    }

    void breath() {
        System.out.println("Breath");
    }
}

class Mammal extends Animal {
    int leg ;
}

class Dog extends Mammal {
    String Breed ;
}
