import java.util.ArrayList;

class Comparator{
    private int max = 0;

    public synchronized void compare(int num){
        max = Integer.max(num, max);
    }

    public int getMax() {
        return max;
    }
}
public class SecondTask {
    public static void main(String[] args) throws InterruptedException {
        Comparator comparator = new Comparator();
        int[][] matrix = {{1,2,3,4},{4,5,6,7},{24,2,6,1}};
        ArrayList<Thread> threads = new ArrayList<>(matrix.length);

        for(int i = 0; i < matrix.length; i++){
            final int tempI = i;
            threads.add(new Thread(()->{
                for(int j = 0; j<matrix[tempI].length;j++){
                    comparator.compare(matrix[tempI][j]);
                }
            }));
        }
        for(Thread thread : threads){
            thread.start();
        }
        for(Thread thread : threads){
            thread.join();
        }
        System.out.println(comparator.getMax());
    }
}
