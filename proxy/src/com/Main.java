package com;

public class Main {

	public static void main(String[] args) {
		Arithmetic arith=new ArithmeticImpl();
		
		Arithmetic proxy=new ArithmeticProxy(arith).get();
		
		int i=proxy.add(1, 2);
		System.out.println("1+2="+i);
		
		Double j=proxy.div(5, 2);
		System.out.println("5/2="+j);

		
	}

}
