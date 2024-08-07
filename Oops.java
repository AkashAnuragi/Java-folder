public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();         // Created a pen object called p1.
        p1.SetColor("Orange");
        System.out.println(p1.color);
        p1.SetTip(7);
        System.out.println(p1.tip);
        // p1.SetColor("Pink");
        p1.color ="Black";
        System.out.println(p1.color);

        Student stud =new Student();
        stud.Calpercentage(56, 60, 74);
        System.out.println(stud.percentage);
        stud.age = 24;
        System.out.println(stud.age);
        
    }
    
}

class Pen {
    String color;
    int tip;

    void SetColor( String Newcolor) {
        color = Newcolor;
    }

    void SetTip(int Newtip) {
        tip = Newtip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void Calpercentage(int math, int chemistry, int physics) {
        percentage =( physics + chemistry + math)/3;
    }
}