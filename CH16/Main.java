package CH16;

import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {
        int[] data = new int[1024 * 1024 * 128];

//        for (int i = 0; i < data.length; i++) {
//            data[i] = ThreadLocalRandom.current().nextInt();
//        }

//        int max = Integer.MIN_VALUE;
//        for (int value : data) {
//            if (value > max) {
//                max = value;
//            }
//        }
//        System.out.println("Max value found:" + max);

        ForkJoinPool pool = new ForkJoinPool();

        RandomArray action = new RandomArray(data, 0, data.length-1, data.length/16);
        pool.invoke(action);

        FindMaxTask task = new FindMaxTask(data, 0, data.length-1, data.length/16);
        Integer result = pool.invoke(task);
        System.out.println("Max value found:" + result);

    }
}
