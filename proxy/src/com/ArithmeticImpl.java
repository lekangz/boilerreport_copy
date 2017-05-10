package com;

public class ArithmeticImpl implements Arithmetic {

	@Override
	public int add(int a, int b) {
		int i=a+b;
		return i;
	}

	@Override
	public double div(int a, int b) {
		double i=(double)a/(double)b;
		return i;
	}

}
