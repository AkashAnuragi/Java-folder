public class variable {
    public static void main(String[] args){
         final int num = 5;
        int num1 = 6;
        String fname = "Akash";
        String lname = "Anuragi";
        num1 = 7;
        // num = 3;   erro : This value can not assign a value to final variable num
        System.out.println(num+num1);
        System.out.println(fname + " " + lname);
    }
}
