import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

class CustomUnsupportedOperationException extends UnsupportedOperationException{
    public CustomUnsupportedOperationException(String message){
        super(message);
    }

}
public class CustomException {
    public static void main(String[] args) throws IOException {
        File log = new File("log.txt");
        double num1 = 0;
        double num2 = 0;
        char operator = 0;
        boolean exit = false;

        if (!log.exists()) {
            try {
                log.createNewFile();
            } catch (IOException e) {
                System.out.println("Файл логирования не создан.");
            }
        }
        FileWriter writer = new FileWriter("log.txt", true);

        try (Scanner scanner = new Scanner(System.in)) {
            while (!exit && log.exists()) {
                System.out.print("Введите первое число: ");
                num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Введите второе число: ");
                num2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Введите оператор: ");
                operator = scanner.nextLine().charAt(0);

                try {
                    System.out.println(calculator(num1, num2, operator));
                } catch (ArithmeticException | CustomUnsupportedOperationException e) {
                    writer.write(e.getMessage() + " " + LocalDateTime.now() + "\n");
                }
                System.out.print("\nDo you want to exit?(y/n): ");
                if (scanner.nextLine().equals("y")) {
                    exit = true;
                }
            }
        } catch (InputMismatchException e) {
            writer.write("Некорректный ввод числа" + " " + LocalDateTime.now() + "\n");
            System.out.println("Произошла ошибка");
            writer.close();
            exit = true;
        }
        writer.close();
    }


        static double calculator(double num1, double num2, char operator){
            return switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '/',':' -> {
                    if (num2 == 0) {
                        System.out.println("Произошла ошибка");
                        throw new ArithmeticException("Деление на ноль!");
                    }
                    yield num1 / num2;
                }
                case '*' -> num1 * num2;
                default -> {
                    System.out.println("Произошла ошибка");
                        throw new CustomUnsupportedOperationException("Оператор " + operator + " не поддерживается.");
                }
            };
        }
    }