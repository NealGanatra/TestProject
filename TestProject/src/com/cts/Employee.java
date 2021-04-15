package com.cts;

public class Employee {
int no;
String name;


public Employee(int no,String name) {
	this.no=no;
	this.name=name;
}

public String toString() {
	return no+":"+name;
}
}
