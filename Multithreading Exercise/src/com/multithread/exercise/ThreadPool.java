package com.multithread.exercise;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class OddNEven implements Runnable {
    //int id;
    int i;

    public OddNEven(int i) {
        this.i = i;
    }

    public void run() {
        print(i);
    }

    public void print(int i) {
        synchronized (this) {
            while (i < 10) {
                //System.out.println("Working on thread: "+i);
                System.out.println(i + " Worked on Thread " + Thread.currentThread().getName());
                i = i + 2;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new OddNEven(0));
        executor.execute(new OddNEven(1));
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
