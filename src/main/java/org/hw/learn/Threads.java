package org.hw.learn;

public class Threads {
	
	public static void main(String[] args) {
		
		//Create thread using anonymous class
		Thread thd1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s is running \n",Thread.currentThread().getName());
			}
		}, "thread1");
		
		//Java 8
		//Lambda is an anonymous function and works with Single abstract method classes like Runnable
		Thread thd2 = new Thread(()-> System.out.printf("%s is running \n",Thread.currentThread().getName()), 
						  "thread2");
		
		thd1.start();
		thd2.start();
	}
}
