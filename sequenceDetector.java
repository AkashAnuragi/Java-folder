import java.util.Scanner;

public class sequenceDetector {

  public static boolean detectSequence(String input, String seq) {
    int state = 0;
    for (char ch : input.toCharArray()) {
      switch (state) { 
        case 0:
          if (ch == seq.charAt(0)) {
            state = 1;
          }
          break;
        case 1: 
          if (ch == seq.charAt(1)) {
            state = 2;
          } else if (ch == seq.charAt(0)) {
            state = 1;
          } else {
            state = 0;
          }
          break;
        case 2:
          if (ch == seq.charAt(2)) {
            state = 3;
          } else if (ch == seq.charAt(0)) {
            state = 1;
          } else {
            state = 0;
          }
          break;
        case 3:
          if (ch == seq.charAt(3)) {
            return true;
          } else if (ch == seq.charAt(0)) {
            state = 1;
          } else {
            state = 0;
          }
          break;
        default:
          break;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary string:");
    String input = sc.nextLine();
    sc.close();
    
    if (detectSequence(input, "1001")) {
      System.out.println("Sequence '1001' found.");
    } else {
      System.out.println("Sequence '1001' not found.");
    }
  }
}
