package CH15.PR1;

public class CountRunnable implements Runnable{

    final int count;
    final String threadName;


    public CountRunnable(int count, String name){
        this.count = count;
        this.threadName = name;
    }

    public void run(){

        for (int i = 1; i <= count; i++){
            System.out.println("Thread " + threadName +
                    ": " + i);
        }
    }
}
