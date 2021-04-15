package com.cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void squareIt(int n) {
		System.out.println("Square is:"+n*n);
	}
	
	public static void main(String[] args) {
	
InterF i=(a,b)-> System.out.println("Sum is:"+(a+b));
i.sum(4,5);
i.sum(7,50);
i.sum(4,8);

A m=(p)->System.out.println(p*p);
m.squareIt(6);

m.prod(6, 3);

Runnable r=()->{
	for(int s=0;s<10;s++) {
		System.out.println("Thread No-"+s);
	}
};
new Thread(r).start();

List<Integer> list=new ArrayList<Integer>();
list.add(20);
list.add(1);
list.add(97);
list.add(5);
list.add(2);

Comparator<Integer> c=(o1,o2)->(o1<o2)?1:(o1>o2)?-1:0;

System.out.println(list);
Collections.sort(list,c);
//Collections.sort(list,new MyComparator());
System.out.println(list);


List<Employee> empL=new ArrayList<>();
empL.add(new Employee(100, "Neal"));
empL.add(new Employee(5, "Ajay"));
empL.add(new Employee(200, "Abi"));
empL.add(new Employee(7, "Sandip"));

System.out.println(empL);
Comparator<Employee> ce=(e1,e2)->(e1.no<e2.no)?-1:(e1.no>e2.no)?1:0;


//Collections.sort(empL,ce);
Collections.sort(empL,(e1,e2)->e1.name.compareTo(e2.name));
System.out.println(empL);
	}
	
	
}
