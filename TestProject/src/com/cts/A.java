package com.cts;

@FunctionalInterface
public interface A{

	public void squareIt(int n);
	
	public default int prod(int a,int b) {
		System.out.println(a*b);
		return a*b;
	}
}
