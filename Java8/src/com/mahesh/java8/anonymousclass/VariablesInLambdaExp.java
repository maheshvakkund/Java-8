package com.mahesh.java8.anonymousclass;

public class VariablesInLambdaExp {
	int x = 8;
	public void m2() {
		Interfa i = ()->{
			int x=9;
				System.out.println("Lambda expression always refers outer class variable:"+this.x);
		};
		i.m1();
	}
	public static void main(String[] args) {
		VariablesInLambdaExp variablesInLambdaExp = new VariablesInLambdaExp();
		variablesInLambdaExp.m2();
	}
}

interface Interfa{
	public void m1();
}