// there are two ways to create a thread one is extended method and another is implement method.
//This is the Example of implements method.
public class thread_implement implements Runnable {
    
    public static void main(String[] args) {
        thread_implement obj = new thread_implement();
        Thread thread =new Thread(obj);
        thread.start();
        System.out.println("This code is outside the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
