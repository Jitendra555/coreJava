package com.jeet.fact;

public class Factorial {

	public static void main(String[] args) {
		chkFact(7);
	}
	public static void chkFact(int n)
	{
		int fact = 1;
		for(int i=1; i<=n ; i++)
		{
			fact  =  fact*i;
		}
		System.out.println("The Factorial of "+n+" is: "+ fact);
	}
}
