public class Recursion16 {
        static String digits[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        public static void PrintDigits(int number){
            // Base Case
            if (number == 0) {
                return;
            }
    
            // Recursive Case.
            int lastdigit = number%10;
            PrintDigits(number/10);
            System.out.print(digits[lastdigit]+ " ");
        }
        public static void main(String[] args) {
            int n =1947;
            System.out.println("The number is :"+ n);
         PrintDigits(n);
        }
    }
    
