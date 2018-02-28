package com.jeet.pyramid;

public class PyramidSameNoCol {
	public static void main(String[] args) {
		printPyramid(9);
	}
	public static void printPyramid(int n)
	{
	int rowCount = 1;
	for(int i = n; i >= 1; i--)
	{
		for(int j = 1; j <= i*2; j++)
		{
            System.out.print(" ");
        }
		for (int j = i; j <= n; j++)
        {
            System.out.print(j+" ");
        }
		for (int j = n-1; j >= i; j--)
        {                 
            System.out.print(j+" ");             
        }
		System.out.println();
        rowCount++;
	}
	}
}
