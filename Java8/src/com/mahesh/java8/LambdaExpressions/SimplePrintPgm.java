package com.mahesh.java8.LambdaExpressions;

/**
 * @author MAHI
 *
 */
public class SimplePrintPgm implements SimplePrintInf {

	public static void main(String[] args) {
		// implementation is provided,and reference of the implementation is of the
		// Interface type
		SimplePrintInf lambdaExpFunctionalInf = () -> {
			System.out.println("Inside Print Method");
		};
		// Using the reference of the Interface we call the print method
		lambdaExpFunctionalInf.print();
	}

	@Override
	public void print() {
		// Implementation is provided in the functional Interface.
	}
}
