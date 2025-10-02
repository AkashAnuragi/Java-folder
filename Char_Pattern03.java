// F 
// E F
// D E F
// C D E F
// B C D E F
// A B C D E F

import java.util.Scanner;

class Char_Pattern03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        char ch = (char)('A'+n-1);

        for(int i = 1;i<= n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            ch = (char)(ch-i-1);
            
            System.out.println();
        }

    }
}