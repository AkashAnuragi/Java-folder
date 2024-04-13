import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Akash Anuragi",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("visit Akash Anuragi");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found.");
        }else{
            System.out.println("Match Not Found.");
        }
    }
}
