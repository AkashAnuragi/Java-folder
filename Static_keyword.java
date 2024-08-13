// Static keyword in java is used to share the same variable or method of a given class.- properties, function, block ,nested class.

public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = " SVM ";
        Student s2 = new Student(); 
        Student s3 = new Student();
        s3.SchoolName = "IIMT";
        System.out.println(s2.SchoolName);

        
    }
    
}

class Student {
    String name; 
    int roll; 
     static String SchoolName;
      void setname(String name) {
        this.name = name;
      }

      String getname() {
        return this.name;
      }
}
