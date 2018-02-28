package com.jeet.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int no,i,j,swap;
		Scanner s = new Scanner(System.in);
		System.out.print("Input number of integers to sort: ");
		no = s.nextInt();
		int array[] = new int[no];
		System.out.println("Enter "+no+" integers: ");
		for(i=0;i<no;i++)
			array[i]=s.nextInt();
		for(i=0;i<(no-1);i++)//iterationForNumberWeWantToSort
		{
			for(j=0;j<no-i-1;j++)//iterationForArraysWeWantToSort
			{
				if(array[j] > array[j+1])//ForAscendingOrder
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		/*//RemoveLogic
		public void removeDuplicate(){
			List<Integer> li=new ArrayList<Integer> ();
			Iterator<Integer> it=li.iterator();
			while(it.hasNext()){
				Intrger i =it.nextInt();
				if(li.contains(i)){
					it.remove();
				}
				else{
					li.add(i);
					System.out.println("li");
				}
			}
		}*/
		System.out.print("Sorted list of Numbers: ");
		for(i=0;i<no;i++)
		{
			System.out.print(array[i]+", ");
		}
	}

}
