import java.util.Scanner;

public class capital {
    public static void firstcapital(String input) { 
       char[] charArray = input.toCharArray();
       for(int i = 0; i < charArray.length; i++) {
          charArray[0] = Character.toUpperCase(charArray[0]);
          if(charArray[i] == ' ') {
             charArray[i+1] = Character.toUpperCase(charArray[i+1]);
          }
       }
       input = String.valueOf(charArray);
       System.out.println(input); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String input = sc.nextLine(); 
       firstcapital(input); 
    }
 }