package com.jeet.pyramid;

public class PyramidNo {

	public static void main(String[] args) {
		printPyramid(9);
	}
	public static void printPyramid(int n)
	{
	int rowCount = 1;
	for(int i=n;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
            System.out.print(" ");
        }
		for (int j = 1; j <= rowCount; j++)
        {
            System.out.print(rowCount+" ");
        }
		System.out.println();
        rowCount++;
	}
	}
}
