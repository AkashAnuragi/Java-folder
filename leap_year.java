import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = year % 100 == 0 && year % 400 == 0;

        String result = (x && (y || z )) ? "This is a leap year" : "This is not a leap year";
        System.out.println(result);
    }
}