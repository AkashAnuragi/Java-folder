// Hybrid Inheritance

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        Shark s1 = new Shark();

        Mammal m1 = new Mammal();
        Dog d1 = new Dog();
        d1.legs = " 4 legs " ;
        Human h1 = new Human();
        h1.legs = " 2 legs " ;

        Birds b1 = new Birds();

        System.out.print(" fish can " );
        f1.swim();
        System.out.print(" shark is type of fish and it is ");
        s1.size();

        System.out.print(" Mammal can " );
        m1.eat();
        System.out.println(" Dog have " + d1.legs);
        System.out.println(" Human have " + h1.legs);
        System.out.print("The  Dog and Human they both can ");
        m1.eat();
        

        System.out.print(" Birds can " );
        b1.breath();
    }
}
// Base case
class Animal {
    String color;

    void eat(){
        System.out.println(" eats");
    }

    void breath() {
        System.out.println("breath");
    }
}
 
// Derived class of Animal.
class Fish extends Animal { 
     int fins; 

     void swim() {
        System.out.println("Swim..");
     }
    }
// Derived class of Fish.
    class Shark extends Fish { 
        void size(){
            System.out.println("Very Big..");
        }
    }
// Derived class of Animal.
class Mammal extends Animal { 
     void walk() {
        System.out.println("Walk..");
     }
}
// Derived class of Mammal.
class Dog extends Mammal{ 
    String legs;
}
// Derived class of Mammal.
class Human extends Mammal{
    String legs;
}

// Derived class of Animal.
class Birds extends Animal { 
     void fly() {
        System.out.println("fly..");
     }
}