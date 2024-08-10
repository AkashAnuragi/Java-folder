public class Constructor01{
    public static void main(String[] args) {
        Student s1 = new Student(" My name is Akash Anuragi...");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollno;
    
    Student( String name){
        this.name = name; 
       // System.out.println("Construction is called...");
    }
}