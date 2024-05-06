import java.util.*;
public class largeststring {
    public static void main(String[] args) {
        String str[] = {"apple","banana","mango"};
        String max_String = str[0];
        for(int i = 0 ; i<str.length; i++){
            if(max_String.compareTo(str[i]) < 0){
                max_String =str[i];
            }
        }
        System.out.println("The Largest String is : " + max_String);
    }
}
