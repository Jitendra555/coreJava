package com.jeet.coreJava;

import java.util.Collections;
import java.util.TreeSet;

public class ATMMachine {
	public static void main(String args[]) {
		withdraw(5623);
	}
		 
public static void withdraw(int total) {
	int q=0,r=0;
	TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());  
	  ts.add(1);  
	  ts.add(2);  
	  ts.add(5);  
	  ts.add(10);  
	  ts.add(20);
	  ts.add(50);
	  ts.add(100);
	  ts.add(200);
	  ts.add(500);
	  ts.add(1000);
	  ts.add(2000);
	for(int i:ts) {
	
		if(total>=i && total!=0)
		{
			q = total/i;
			total=total%i;
			 //r=r+q;
			 r = q++;
			 System.out.println("Coin "+i+" = "+r);
		}}
	//return r;
}
}
