import java.util.Scanner;

public class LengthofWords {
    public static int lengthOfWOrds(String str) {
        int length = 0;
        int i = str.length() - 1;

        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && str.charAt(i) != ' ') {
        length++;
        i--;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write String: ");
        String str = sc.nextLine();
        System.out.println("The length of last Word is: " + lengthOfWOrds(str));
    }
}
