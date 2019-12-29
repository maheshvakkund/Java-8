package com.mahesh.java8.LambdaExpressions;

/**
 * @author MAHI
 *
 */
public class ThreadExecution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Runnable() is a functional Interface so we provide the implementation for the
		 * run() using lambda expression and reference for lambda expression is saved in
		 * 'r'
		 */
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("CHILD THREAD");
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("MAIN THREAD");
		}

	}
}
