import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpVerifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //String num = "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])";
        String num = "(42[0-5]|[1-4][0-1][0-9]|[1-4][0-9][0-9]|[3-9]?[0-9]|2?[0-5])";
        String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num + "$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
    }
}
