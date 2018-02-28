package com.jeet.string;

public class StringTest {
	public static void main(String args[])
	{
		String a = "xyz";
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(a.getClass().getName());
		System.out.println(a.hashCode());
		//a = a.toUpperCase();
		System.out.println(a.getClass().getName());
		System.out.println(a.hashCode());
		System.out.println(a.equals(a));
		System.out.println(a);
		System.out.println(a.equals(s1));
		System.out.println(a==s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
