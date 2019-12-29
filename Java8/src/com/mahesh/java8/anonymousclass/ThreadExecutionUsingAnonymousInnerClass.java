package com.mahesh.java8.anonymousclass;

/**
 * @author MAHI
 *
 */
public class ThreadExecutionUsingAnonymousInnerClass {
	public static void main(String[] args) {

		/*
		 * ANONYMOUS INNER CLASS IS CREATED AND THE REFERENCE IS STORED IN THE REFERENCE
		 * 'r'
		 */
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("CHILD THREAD");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("MAIN THREAD");
		}
	}
}
