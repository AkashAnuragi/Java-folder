public  class StringFunction{
    public static void main(String[] args){
        String S1 = "Akash";
        String S2 = "Akash";
        String S3 = new String("Akash");

        if (S1 == S2) {
            System.out.println("String is Found!!");
        }else{
            System.out.println("String is not Found!!");
        }
 
        // In this condition the S1 and S2 are not equal because both have the different object .So we make them equal we use the Equals parameter.
        if (S1 == S3) {
            System.out.println("String is Found!!");
        }else{
            System.out.println("String is  not Found!!");
        }


        if (S1.equals(S3)) {  // Now they both are equal.
            System.out.println("String is Found!!");
        }else{
            System.out.println("String is  not Found!!");
        }
    }
}