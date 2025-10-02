import java.util.Scanner;

public class HammingDistanceCal {

    public static int hammingDistance(String str1, String str2) {
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Strings must be of equal length to compute Hamming distance.");
        }

        int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        try {
            int distance = hammingDistance(str1, str2);
            System.out.println("The Hamming Distance is: " + distance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}