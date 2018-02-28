package com.jeet.constructor;

public class Test {
static int count=0;
{
	count++;
	System.out.println("Instance block");
	}
Test()
{
	System.out.println("Default Constructer");
	}
Test(int i)
{
	System.out.println("int param Constructer");
	}
Test(double d)
{
	System.out.println("Double param Constructer");
	}
	public static void main(String[] args) {
		
		Test t2=new Test(10);
		Test t1=new Test();
		Test t3=new Test(10.5);
		System.out.println("The no. of objects created:"+count);
	}

}
