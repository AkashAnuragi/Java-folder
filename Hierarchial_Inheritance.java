// Hierarchial Inheritance

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        Mammal m1 = new Mammal();
        Birds b1 = new Birds();
        System.out.print(" fish can " );
        f1.swim();
        System.out.print(" Mammal can " );
        m1.eat();
        System.out.print(" Birds can " );
        b1.breath();
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println(" eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

class Fish extends Animal { 
     int fins; 

     void swim() {
        System.out.println("Swim..");
     }
    }

class Mammal extends Animal { 
     void walk() {
        System.out.println("Walk..");
     }
}

class Birds extends Animal { 
     void fly() {
        System.out.println("fly..");
     }
}