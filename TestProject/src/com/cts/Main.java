package com.cts;

import com.model.User;

public class Main {
public static void main(String[] args) {
	System.out.println("hello World!!");
	User u1=new User(1,"hey");
	User u2=new User(1,"heyl");
	
	if(u1.equals(u2)) {
		System.out.println("Same");
	}
	else
		System.out.println("Different");
	
	System.out.println("U1-->"+u1+"\t U2-->"+u2);
}

}
