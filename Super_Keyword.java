// The super keyword in Java is a reference variable which is used to refer immediate parent class object.

public class Super_Keyword {
    public static void main(String[] args) {
        Horse H = new Horse();
        System.out.println(H.color); // prints color of Horse class.
        System.out.println(H.getColor()); // prints color of Animal class.
    }
}

class Animals {
    String color ="Black";
    Animals() {
        System.out.println("Animal Constructor is called...");
    }
}

class Horse extends Animals {
    String color;
    Horse() {
         color = "Yellow";
        System.out.println("Horse Constructor is called...");
    }

    String getColor() {
        return super.color;
    }
}
