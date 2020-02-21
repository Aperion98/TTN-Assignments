package com.multithread.exercise;

import java.util.Scanner;

class Process extends Thread{

    private volatile double runnig = 59;
    @Override
    public void run() {
        while (runnig == 59){
            System.out.println("Hello");
            try {
                Thread.sleep(500);      //Sleep for 0.5 sec
            } catch (InterruptedException e) {

            }
        }
    }
    public void shutdown(){
        runnig = 40;             // Change the state of runnig to false to stop the infinite while loop
    }
}
public class Volatile {
    public static void main(String[] args) {
        Process pr = new Process();
        pr.start();
        new Scanner(System.in).nextLine();          //Accept Enter key as an event for shutdown()
        pr.shutdown();                  //shutdown initiated once enter key is accepted
    }
}
