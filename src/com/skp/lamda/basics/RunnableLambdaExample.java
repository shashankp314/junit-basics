package com.skp.lamda.basics;

public class RunnableLambdaExample {
	
	public static void main(String[] agrs) {
		Runnable r = ()->System.out.println("Hi there from Lamda");
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Hi there from Anonymous class");
			}
		};
		Thread t = new Thread(r);
		Thread t2 = new Thread(r2);
		t.start();
		t2.start();
		//t.start();
	}
}
