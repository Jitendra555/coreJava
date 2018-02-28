package com.jeet.pyramid;

public class PyramidOneTwoOneReverse {
	public static void main(String[] args) {
		printPyramid(9);
	}
	public static void printPyramid(int n)
	{
	int rowCount = n;
	for(int i = 0; i < n; i++)
	{
		for(int j=1;j<=i*2;j++)
		{
            System.out.print(" ");
        }
		for (int j = 1; j <= rowCount; j++)
        {
            System.out.print(j+" ");
        }
		for (int j = rowCount-1; j >= 1; j--)
        {
            System.out.print(j+" ");
        }
		System.out.println();
        rowCount--;
	}
	}
}
