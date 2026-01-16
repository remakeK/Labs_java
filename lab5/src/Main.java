import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args){
        String text = "Some text 92.1 w1th rand0m num53rs";
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}