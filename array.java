import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of Array

        int marks[] = new int[100];
        System.out.print("Enter the marks of Physics: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter the marks of math: ");
        marks[2] = sc.nextInt();
         String cars[] = {"volvo", "BMW", "Safari", "Swift"}; 
         int num[] ={2, 34, 454, 54,56};
         System.out.println("Marks of Physics is :" +marks[0]);
         System.out.println("Marks of Chemistry is :" +marks[1]);
         System.out.println("Marks of Math is :" +marks[2]);
         System.out.println("Before updation of cars[1] : "+cars[1]);
         System.out.println(num[2]);

        //Updation
        cars[1] = "Ford";
        System.out.println(" after updation of cars[1] : " + cars[1]);

    }
}
