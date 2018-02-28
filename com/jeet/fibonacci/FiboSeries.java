package com.jeet.fibonacci;

public class FiboSeries {

	public static void main(String[] args) {
		int n=5,a=0,b=1,c;
		while(a<=n)
		{
			System.out.println(a+"");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
