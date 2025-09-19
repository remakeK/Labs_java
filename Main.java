import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i<101; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
            }
        }
        return flag;
    }
}