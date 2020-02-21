package com.multithread.exercise;

class Sync {
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
/*
class SyncBlock {
    int a = 0;
    int b = 0;
    Object lock1 = new Object();

    public void sum1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){}
            a++;
        }
    }

    public void sum2() {
        synchronized (this) {
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){}
            b++;
        }
    }

    public void addblock() {
        for (int i = 0; i < 1000; i++) {
            sum1();
        }
    }
    public void addblock2() {
        for (int i = 0; i < 1000; i++) {
            sum2();
        }
    }

    public void main() {
        System.out.println("Starting Synchronized block with locks....");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                    addblock();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                    addblock2();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("The value of \'a\' is: " + a+" The value of \'b\' is: " + b);
        System.out.println("Time Taken: "+ (end-start));
    }
}*/

public class Synchronization {
    public static void main(String[] args) {
        Sync sync_method = new Sync();
        sync_method.main();

        /*SyncBlock sync_block = new SyncBlock();
        sync_block.main();*/
    }
}
