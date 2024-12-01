import java.util.Stack;

public class Stack06 {

    static String reverseStack(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();

    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseStack(str);



        System.out.println(" Before Reverse Stack is: " + str );

        System.out.println("Reverse Stack is: " + result );
        
    }
}
