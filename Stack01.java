import java.util.ArrayList;
public class Stack01 {
//  Using ArrayList
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // if Stack are Empty.
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // if you want to push data in the stack.
    public static void push(int data) {
        list.add(data);
    }
    //  if you want to pop or delete data in the stack.
    public static int pop() {
        if(isEmpty()) {
            return -1;
        }
        
        int top = list.get(list.size() -1);
        list.remove(list.size() - 1);
        return top;
    }

    public static int peek() {
        if(isEmpty()) {
            return -1;
        }

        int top = list.get(list.size() -1);
        return top;
    }

    }
    
    public static void main(String[] args) {
        Stack obj = new Stack();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();            
        }
    }
}
