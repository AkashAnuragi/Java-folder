public class String2 {
    public static void main(String[] args) {
        String txt = "Hello my name is Akash Anuragi!!";
        System.out.println(txt.indexOf("Akash"));

        // Concatination
        String fname = "Akash";
        String lname = "Anuragi";
        System.out.println(fname.concat(lname)); //without gap
        System.out.println(fname +" " + lname);
        
        // length of String
        System.out.println(txt.length());
    }
    
}
