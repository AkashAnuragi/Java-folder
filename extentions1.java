public class extentions1 {
    public static void main(String[] args) {
        // if an error is occur, we can use Try catch to catch the error and execute some code to hande it.
        try{
            int[] mynum = {1,2,3};
            System.out.println(mynum[12]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        //The finally statement lets you execute code,after try catch,regardless of the result.
        finally{
            System.out.println("The try catch is finished");
        }
    }
}
