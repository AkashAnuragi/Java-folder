import java.util.*;

import org.w3c.dom.Node;

public class Stack02 {
    // Using LinkedList
    public static class Node {
        int data ;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class  Stack {
    public static Node head;

        //  Check Stack is empty or not
        public  boolean isEmpty() {
          return head == null;
        }
        //   Push an element in the Stack
        public  void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
               head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }

        // Pop an element from the Stack.
        public  int pop() {
            if (head == null) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek 

        public  int peek(){

            if (isEmpty()) {
                
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
          while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();            
        }

        
    }
    
}
