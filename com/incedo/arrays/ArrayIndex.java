package com.incedo.arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] inputArray = new int[]{33,12,11,1,5,89,23,14};
		int place = findIndex(inputArray, 1);
		System.out.println(place);
	}
	public static int findIndex(int[] input, int item)
	{
		int counter = 0;
		for(int number : input)
		{
			if(number == item)
			{
				return counter;
			}
			counter++;
		}
		return-1;
	}
}
