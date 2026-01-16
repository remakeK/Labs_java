import java.util.*;
import java.util.concurrent.CountDownLatch;

public class ThirdTask {
    static class Worker implements Runnable {
        private List<Integer> items;
        private int maxWeight;
        private CountDownLatch start;
        private CountDownLatch end;

        public Worker(List<Integer> items, int maxWeight, CountDownLatch startLatch, CountDownLatch doneLatch) {
            this.items = items;
            this.maxWeight = maxWeight;
            this.start = startLatch;
            this.end = doneLatch;
        }

        @Override
        public void run() {
            int carried = 0;
            List<Integer> taken = new ArrayList<>();

            try {
                start.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (items) {
                Iterator<Integer> iterator = items.iterator();
                while (iterator.hasNext()) {
                    int weight = iterator.next();
                    if (carried + weight <= maxWeight) {
                        carried += weight;
                        taken.add(weight);
                        iterator.remove();
                    }
                }
            }

            System.out.println(Thread.currentThread().getName() + " перенёс " + taken);
            end.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> warehouse = new ArrayList<>(Arrays.asList(40, 50, 20, 30, 70, 60, 10, 20, 40, 50));
        int maxWeight = 150;

        while (!warehouse.isEmpty()) {
            CountDownLatch start = new CountDownLatch(1);
            CountDownLatch end = new CountDownLatch(3);

            for (int i = 0; i < 3; i++) {
                new Thread(new Worker(warehouse, maxWeight, start, end), "Грузчик " + (i + 1)).start();
            }

            start.countDown();
            end.await();

            System.out.println("Оставшиеся товары: " + warehouse);
        }
    }
}
