import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class FirstTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = {2,5,1,2,5123,5,6,3222,4325,523,63};
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> task1 = executor.submit(() ->{
            int s = 0;
            for(int i = 0; i < array.length/2 ;i++){
                s+=array[i];
            }
            return s;
        });

        Future<Integer> task2 = executor.submit(() ->{
            int s = 0;
            for(int i = array.length/2; i < array.length ;i++){
                s+=array[i];
            }
            return s;
        });
        executor.shutdown();

        System.out.println(task1.get() + task2.get());
    }
}
