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

    public void addFirst(int data){  // O(1)
        // Step 1
        Node newNode = new Node(data);
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
    }
}
