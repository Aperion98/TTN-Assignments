
package com.multithread.exercise;
class Sync1{
    private int count = 0;
    public synchronized void add() {
        count++;
    }
    public void main() {
        System.out.println("Starting Synchronized Method....");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 100; i++) {
                    add();
                }
                System.out.println("Thread1 increased counter to 100 and will now sleep for 100ms");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    add();
                }
                System.out.println("Thread2 increased counter to 100 times more and will now sleep for 100ms");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){}
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println("Joining Threads Now");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("The Counter increased to: " + count);
        System.out.println("Time Taken: "+ (end-start));
    }

}

public class SleepnJoin {
    public static void main(String[] args) {
        Sync sync_method = new Sync();
        sync_method.main();   }
}
