package com.onbill.java.programs;

public class MultiThreading1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " "+i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiThreading1());
        Thread thread2 = new Thread(new MultiThreading1());

        thread1.start();
        thread2.start();
    }
}

