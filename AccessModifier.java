public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Akash Anuragi";
        myAcc.Mypassword("AKash539");  // passward can only change but not showing in display because of private modifier.
        System.out.println(myAcc.Username );
    }
}

class BankAccount {
    public String Username;
    private String password;

    public void Mypassword(String pwd) {
        pwd = password;
    }
}
