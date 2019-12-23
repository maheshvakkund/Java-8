package com.mahesh.java8.LambdaExpressions;

public class Add2NumbersUsingLambda implements Add2NumbersInf {

	public static void main(String[] args) {
		Add2NumbersInf add2NumbersInf = (a, b) -> {
			System.out.println("Addition of 2 numbers is : " + (a + b));
		};

		add2NumbersInf.add(5, 4);
	}

	@Override
	public void add(int a, int b) {

	}

}
