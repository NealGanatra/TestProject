package com.cts;

public class Tester{


	
	static void m3() {
		System.out.println("m3 for Tester");
	}
	
	public static void main(String[] args) {
		
	MyInterface.m3();
	m3();
	
	BTester B=new BTester();
	B.m1();
	}

}
