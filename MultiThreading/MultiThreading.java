package com.onbill.java.programs;

class MultiThread extends Thread{
	public void run() {
		System.out.println("Thread"+Thread.currentThread().getId());
	}
}

class MultiThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=50;i++) {
			MultiThread t=new MultiThread();
			t.start();
		}
		
		for(int i=50;i<=100;i++) {
			Thread t1=new Thread(new MultiThread1());
			t1.start();
		}

	}

}
