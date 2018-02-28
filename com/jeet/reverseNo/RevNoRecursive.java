package com.jeet.reverseNo;

public class RevNoRecursive {
	public static void main(String[] args) {
		System.out.println(revNo(12345));
	}
	public static int revNo(int n){
	int sum = 0, r;
		while(n!=0)
		{
			r = n%10;
			sum = sum*10+r;
			n = n/10;
		}
		return sum;
	}
}
