import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] input = null;
        try {
        input = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
            for (int i = 0; i < 4; i++) {
                sum += input[i];
            }
            System.out.println(sum/input.length);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Array is too short!");
        }
        catch (NumberFormatException e){
            System.out.println("Invalid format for int!");
        }
        }
}