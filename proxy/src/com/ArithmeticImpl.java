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
	
	public void fl(){
		System.out.println("sljlfjl");
	}

	
	public void f2(){
		int a=1+2;
	}

	public void f3(){
		int a=3+2;
	}


}
