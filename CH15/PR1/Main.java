package CH15.PR1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        es.submit(new CountRunnable(20,"A"));
        es.submit(new CountRunnable(20,"B"));
        es.submit(new CountRunnable(20,"C"));

        es.shutdown();
    }
}
