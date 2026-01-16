import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLetter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            String result = matcher.replaceAll("!$1$2!");
            System.out.println(result);
        }
    }
}
