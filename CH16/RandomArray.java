package CH16;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray extends RecursiveAction {
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;

    public RandomArray(int[] myArray, int start, int end, int threshold) {
        this.threshold = threshold;
        this.myArray = myArray;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (end - start < threshold) {
            for (int i = start; i <= end; i++) {
                myArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int midway = (end - start) / 2 + start;
            RandomArray r1 = new RandomArray(myArray, start, midway, threshold);
            RandomArray r2 = new RandomArray(myArray, midway + 1, end, threshold);
            invokeAll(r1, r2);
        }
    }
}
