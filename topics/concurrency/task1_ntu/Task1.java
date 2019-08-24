package concurrency.task1_ntu;

/**
 * Task #1 Launch 3 threads with Thread class
 *
 *  Create class, which extends Thread class, overrides its run() method and run three different
 *  threads in parallel.
 *
 *  Each new thread should 50 times print its name and internal counter.
 *  Just printing is fast operation, so add a little "delay" in run() method if threads working
 *  one by one by one
 *
 *  Additional: Check difference between execution run() and start() method.
 */


public class Task1 {

    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread();
        ExtendsThread t2 = new ExtendsThread();
        ExtendsThread t3 = new ExtendsThread();


        t1.start();
        t2.start();
        t3.start();
    }

    public static class ExtendsThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("Current thread name: " + Thread.currentThread().getName() + " its counter: " + i);
            }
        }
    }
}
