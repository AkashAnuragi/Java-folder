public class concurrency_problem extends Thread {
    public static int amount =0;
    public static void main(String[] args) {
        concurrency_problem thread = new concurrency_problem();
        thread.start();
        //wait for the thread to finish.
        while(thread.isAlive()){
            System.out.println("waiting....");
        }
        //Update amount and print its value
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
