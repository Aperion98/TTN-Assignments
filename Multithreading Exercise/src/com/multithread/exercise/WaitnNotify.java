package com.multithread.exercise;

import java.util.*;

class Work {
    //Object lock1 = new Object();
    //Object lock2 = new Object();
    public void produce() throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Producer Running....");
                System.out.println(Math.random());
                wait();
                notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            Scanner scanner = new Scanner(System.in);
            //Thread.sleep(5000);

            for (int i = 0; i < 3; i++) {
                System.out.print("Waiting for key press To resume: ");
                scanner.nextLine();
                System.out.println("Key Pressed.....");
                notify();
                wait();
            }
            System.out.println("Loops ended exiting");
        }
    }
}

public class WaitnNotify {
    public static void main(String[] args) throws InterruptedException {
        Work work = new Work();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
