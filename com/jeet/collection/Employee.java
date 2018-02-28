package com.jeet.collection;

import java.util.Comparator;
import java.util.TreeSet;

 public class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name,int id){
		this.name = name;
		this.eid = eid;
	}
	public String toString()
	{
		return name+"_"+eid;
	}
	
	@Override
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else return 0;
	}
 }
class CompComp{
	public static void main(String[] args) {
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("balaiah",200);
		Employee e3 = new Employee("chiru",50);
		Employee e4 = new Employee("venki",150);
		Employee e5 = new Employee("nag",100);
		
		TreeSet<Employee> t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t1);
	}
}
class MyComparator1 implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}
