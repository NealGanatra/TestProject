package com.cts;

@FunctionalInterface
public interface InterF {

	public void sum(int a,int b);
	
	static public void   m2() {
		
	}
	
	default void m3() {
		System.out.println("hi");
	}
	
}
