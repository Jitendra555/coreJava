package com.jeet.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}
		
	class MyComparator implements Comparator
	{
		@Override
		public int compare(Object obj1, Object obj2) {
			String s1 = obj1.toString();
			String s2 = obj2.toString();
			int I1 = s1.length();
			int I2 = s2.length();
			if(I1<I2)
				return -1;
			else if(I1>I2)
				return 1;
			else
				return s1.compareTo(s2);
		}
	}