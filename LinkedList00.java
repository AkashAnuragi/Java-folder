import org.w3c.dom.Node;

public class LinkedList00 {
    public static class Node{
        int data ;
        Node next;

        public  Node( int data){
            this.data = data; 
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){  // O(1)
        // Step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail =newNode;
            return;
        }
        // Step 2
        newNode.next = head;

        // Step 3
        head = newNode;
    }

    public void addLast(int data){  // O(1)
        // Step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2
        tail.next = newNode;

        // Step 3
        tail = newNode;
    }

    public void add(int indx, int data) {
        if (indx < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (indx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < indx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode; // Update tail if new node is added at the end
        }
    }

    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty.");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if (size == 0) {
            System.out.println("LL is Empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is Empty.");
            return Integer.MIN_VALUE;
         }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
          return val;
        }

        //prev value -> size - 2.
        Node prev = head;
        for(int i =0; i<size-2;i++){
            prev = prev.next;
        }

        int val = head.next.data;  // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if( temp.data == key ) {// key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Not found key 
        return -1;
       
    }

    public int helper(Node head, int key ){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;

    }
    public int recSearch(int key ){
       return helper(head, key);
    }

    // Reverse Linked list
    public void reverse(){ // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        head =prev;
    }

    // remove Nth node 
    public void deleteNthfromEnd(int n){
        //calculate size 
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

         if(n == sz){
            head = head.next; // remove first
            return; 
         }

         // sz - n
         int i = 1;
         int itoFind = sz - n;
         Node prev = head;
         while(i < itoFind){
            prev = prev.next;
            i++;
         }

         prev.next = prev.next.next;
         return;
    }
    public static void main(String[] args) {
        LinkedList00 li = new LinkedList00();
        li.print();
        li.addFirst(2);
        li.print();
        li.addFirst(1);
        li.print();
        li.addLast(3);
        li.print();
        li.addLast(4);
        li.add(2, 5);
        li.add(-2, 9);
        li.add(9, 19);
        li.print();
        // System.out.println( "The size of list is: " + li.size);
        // li.removeFirst();
        // li.print();
        // li.removeLast();
        // li.print();
        // System.out.println(li.size);
        // System.out.println(li.itrSearch(3));
        // System.out.println(li.itrSearch(10));

        // System.out.println(li.recSearch(3));
        // System.out.println(li.recSearch(10));
        // li.reverse();
        li.deleteNthfromEnd(3);
        li.print();
    }
}
