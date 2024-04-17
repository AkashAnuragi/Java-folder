// there are two ways to create a thread one is extended method and another is implement method.
//This is the Example of Extend method.
public class thread_extend extends Thread {
    public static void main(String[] args) {
        thread_extend thread = new thread_extend();
        thread.start();
        System.out.println("This code is outside the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
