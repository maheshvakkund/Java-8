package com.mahesh.java8.anonymousclass;

/**
 * @author MAHI
 *
 */
public class ThreadExecutionUsingLambdaExpression {
	public static void main(String[] args) {
		/*
		 * LAMBDA EXPRESSION
		 */
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("CHILD THREAD");
			}
		};

		Thread t = new Thread(r);

		/* SIMPLIFIED VERSION */
		/*
		 * Thread t = new Thread(() -> { for (int i = 0; i <= 10; i++) {
		 * System.out.println("CHILD THREAD"); } });
		 */

		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("MAIN THREAD");
		}
	}
}
