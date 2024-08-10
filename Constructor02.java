/* Types of Constructor.
1. Non-parameterized Constructor
2. Parameterized Constructor 
3. Copy Constructor */ 

// In this program we learn about first two Constructor and the copy Constructor learn in next program.


public class Constructor02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Akash Anuragi", 10);
        System.out.println(s2.name );
        System.out.println(s2.rollno);
    }
}
 class Student {
    String name; 
    int rollno; 

    Student(){
        System.out.println("This is an Non- parameterized  Constructor...");
    }

    Student(String name, int rollno){   // Parameterized Constructor
        this.name = name;
        this.rollno = rollno;
    }
 }