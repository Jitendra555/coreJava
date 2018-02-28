package com.jeet.prime;

public class ListPrimes {
	 public static void main(String[] args) {
	        printPrimes(100);
	    }

	public static void printPrimes(int max) {
	    int counter = 0;
	    for (int i = 2; i <= max; i++) {
	        counter = 0;				 //reset counter at the beginning of the outer loop. So every time it will be 0.
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                counter++;
	            }
	        }
	        if (counter == 0) {
	            System.out.println(i);
	        }
	    }
	}
}