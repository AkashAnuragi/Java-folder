import java.util.Scanner;

public class compression {
    public static String Compression(String str){
        String NewStr ="";
        for(int i = 0 ; i<str.length() ;i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            NewStr += str.charAt(i);
            if (count > 1) {
                NewStr += count.toString();
            }
        }
        return NewStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(Compression(str));
    }
}
