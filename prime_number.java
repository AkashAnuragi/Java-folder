import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        if (number == 2) {
            System.out.println("this is a prime number.");   
        }
        else{
            boolean isprime = true;

        for(int i=2 ; i<=Math.sqrt(number) ; i++){
            if (number%i==0) {
                isprime =false;
            }
        }
        if (isprime==true) {
            System.out.println("This is a prime number.");
        }
        else{
            System.out.println("This is not a prime number.");
        }
        }
    }
}
