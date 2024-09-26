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

    public void add(int indx, int data){

        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode  = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < indx -1) {
            temp = temp.next;
            i++;
        }
         // When i == index  temp -> prev
         newNode.next = temp.next;
         temp.next = newNode;
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
        li.print();
        // System.out.println( "The size of list is: " + li.size);
        li.removeFirst();
        li.print();
        li.removeLast();
        li.print();
        System.out.println(li.size);
    }
}
