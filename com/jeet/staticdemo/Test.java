package com.jeet.staticdemo;

public class Test {
	public static void m1()
	{
		System.out.println("Static method");//3rd print
	}
	public void m2()
	{
		System.out.println("non-static method");//10th print
	}
	{
		System.out.println("First Instance Block");//4&7th print
	}
	static{
		System.out.println("First Static Block");//1st print
	}
	Test()
	{
		System.out.println("Constructor");//6&9th print
	}
	{
		System.out.println("Second Instance Block");//5&8th print
	}
	public static void main(String args[])
	{
		//System.out.println("main method");
		m1();
		Test t1 = new Test();
		Test t2 = new Test();
		t1.m2();
		System.out.println("main() method");//11th print
	}
	static{
		System.out.println("Second Static Block");//2nd print
	}

}
