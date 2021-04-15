package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BTester implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	//Hello this is neel
	public static void main(String[] args) {
		
		Predicate<String> p=s->s.length()%2!=0;
		//System.out.println(p.test(5));
		Function<String,Integer> f=j->j.length();
		Function<Integer,Integer> f2=g->g*g;
		String arr[]= {"Neel","Ganatra","TCS","Mphasis"};
		Predicate<String> p1=s1->(s1.length()>3 && s1.contains("a"));
		for(String m:arr) {
			//if(p1.test(m))
			//if(p1.or(p).test(m))//if(p1.and(p).test(m))
			if(p1.test(m))
			{
			System.out.println(m);
			System.out.println("func-->"+f.apply(m));
			System.out.println("Square fun-->"+f2.apply(m.length()));
			}
			 
			
		}
		List<Employee> el=new ArrayList<>();
	Employee e=new Employee(1, "Neel");
	Employee e1=new Employee(2, "Ajay");
	Employee e3=new Employee(3, "Sandip");
	Employee e4=new Employee(4, "Abhi");
	el.add(e);
	el.add(e1);
	el.add(e3);
	el.add(e4);
	
	Function<Integer,Employee> f3=emp->el.get(emp);
	Consumer<Employee> c=fd->{System.out.println(fd.name+"\t");
	System.out.println("Hi "+fd.no);
	};
	for(Employee er:el) {
	//System.out.println(f3.apply(er.no));
	c.accept(er);
	}
	
	BiPredicate<Integer, String> bp=(a,b)->b.length()==a;
	System.out.println(bp.test(5, "Neela"));
	
	IntPredicate pe=o->o%3==0;
	System.out.println(pe.test(6));
	
	IntFunction fl=j->j*j;
	System.out.println(fl.apply(5));
	
	BiFunction<Integer, String, Employee> bf=(m,n)->new Employee(m,n);
	System.out.println(bf.apply(2, "Jay"));
	
	BiConsumer<Integer, String> bc=(b,r)->System.out.println(r.length()+b);
	bc.accept(5, "KJ");
	
	IntConsumer vi=i->System.out.println(i+1);
	vi.accept(9);
	
	ToDoubleBiFunction<Employee, Integer> tbd=(n,w)->((n.no+w)/100);
	System.out.println(tbd.applyAsDouble(e1, 500));
	
	UnaryOperator<Integer> uop=u->u*u;
	System.out.println(uop.apply(8));
		
	IntUnaryOperator iun=u->u*u+1;
	System.out.println(iun.applyAsInt(4));
		
	BinaryOperator<Integer> biop=(k,q)->k*q;
	System.out.println(biop.apply(7, 3));
	
	
	ArrayList<Integer> alist=new ArrayList<Integer>();
	alist.add(10);
	alist.add(51);
	alist.add(5);
	alist.add(41);
	alist.add(6);
	
	ArrayList<Integer> str=(ArrayList<Integer>) alist.stream().filter(i->i>20).collect(Collectors.toList());
	System.out.println(str);
	
	ArrayList<Integer> str2=(ArrayList<Integer>) alist.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(str2);
	
	Integer min=alist.stream().min(((a1,a2)->(a1<a2)?-1:(a1>a2)?1:0)).get();
	System.out.println("min value -->"+min);
	
	Integer max=alist.stream().max((b1,b2)->b1.compareTo(b2)).get();
	System.out.println("max value -->"+max);
	
	alist.stream().forEach(System.out::println);
	System.out.println("Hello");
	alist.stream().forEachOrdered(System.out::println);
	
	Consumer<Integer> c3=u->System.out.println("Square of "+u+" is "+u*u);
	c3.accept(2);
	
	alist.stream().forEach(c3);
	
	}

}
