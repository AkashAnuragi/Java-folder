// Copy Constructor.

public class Constructor03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akash Anuragi";
        s1.roll = 10;
        s1.password = "s1password";
        s1.marks[0] = 70;
        s1.marks[1] = 50;
        s1.marks[2] = 100;
        System.out.println("s1 marks[1] :" + s1.marks[1]);
         Student s2 = new Student(s1);
         s2.password = "S2password";
         s1.marks[1] = 80;
         for(int i= 0 ; i<3 ; i++){
            System.out.println( "marks["+ i + "]" + " " + s2.marks[i]);
         }

         System.out.println(s1.password + "," + s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy Constructor. 
    // Shallow copy constructor. 
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks =s1.marks;
    // }

// Deep copy constructor.
// deep copy means change don't reflect .
    Student( Student s1){
        marks = new int[3];

        for( int i=0; i<marks.length ;i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Student(){
         marks = new int[3];
    }
    

}