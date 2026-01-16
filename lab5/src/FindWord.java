import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String symbol = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b"+symbol+"\\w*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
