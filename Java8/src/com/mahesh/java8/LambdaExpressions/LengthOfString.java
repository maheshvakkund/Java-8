package com.mahesh.java8.LambdaExpressions;

public class LengthOfString implements LengthOfStringInf {

	public static void main(String[] args) {
		LengthOfStringInf lengthOfStringInf = (s) -> s.length();
		System.out.println("Length of the String is : " + (lengthOfStringInf.getLength("JAVA")));
	}

	@Override
	public int getLength(String s) {
		return 0;
	}

}
