package com.jeet.reverseNo;

public class RevNo {

	public static void main(String[] args) {
		int n = 1234567891, sum = 0, r;
		while(n!=0)
		{
			r = n%10;
			sum = sum*10+r;
			n = n/10;
		}
		System.out.println(sum);
	}

}
