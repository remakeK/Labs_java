import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*\\d).{8,16}");
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
    }
}
