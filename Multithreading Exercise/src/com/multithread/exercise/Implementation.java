package com.multithread.exercise;

import java.lang.*;

class First extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Implemented by extending Thread class: " + i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Second implements Runnable {
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Implemented by implying Runnable Interface: " + i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        First tf1 = new First();         // calling method which extends Thread class
        First tf2 = new First();         // calling method which extends Thread class
        Thread ts1 = new Thread(new Second());       //calling method which implements Runnable
        Thread ts2 = new Thread(new Second());       //calling method which implements Runnable
        Thread ti1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Implemented by creating inner class");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        tf1.start();
        tf2.start();
        ts1.start();
        ts2.start();
        ti1.start();
    }
}
