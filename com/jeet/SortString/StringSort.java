package com.jeet.SortString;

public class StringSort {

	public static void main(String[] args) {
		String str = "mahesh,ramesh,aasas,baas,Aass,Bsdd,wwewer,aaa";
		String[] strArr = str.split(",");
		for(int i = 0;i<strArr.length;i++)
		{
			for(int j=i+1;j<strArr.length;j++)
			{
				if(strArr[i].compareTo(strArr[j])>0)
				{
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		for(String ss:strArr)
		{
			System.out.println(ss);
		}
	}

}
