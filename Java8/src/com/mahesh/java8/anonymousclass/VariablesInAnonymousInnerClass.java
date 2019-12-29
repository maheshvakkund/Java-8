package com.mahesh.java8.anonymousclass;

public class VariablesInAnonymousInnerClass {

	int x = 8;

	public void m2() {
		Interf i = new Interf() {
			int x = 9;

			@Override
			public void m1() {
				/*
				 * Inside Anonymous inner class THIS KEYWORD always refers to Current Anonymous
				 * Inner class Object but not outer class.
				 */
				System.out.println("Anonymous inner class variable : " + this.x);// Declaration of variable is possible
																					// in
																					// Anonymous inner class
				/*
				 * TO refer to outer class variable
				 */
				System.out.println("Outer class variable : " + VariablesInAnonymousInnerClass.this.x);
			}
		};
		i.m1();
	}

	public static void main(String[] args) {
		VariablesInAnonymousInnerClass variablesInAnonymousInnerClass = new VariablesInAnonymousInnerClass();
		variablesInAnonymousInnerClass.m2();
	}
}

interface Interf {
	public void m1();
}