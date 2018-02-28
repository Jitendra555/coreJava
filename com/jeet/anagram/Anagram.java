package com.jeet.anagram;

public class Anagram {

	public static void main(String[] args)throws Exception {
		match("jitu","utji");
		match("Toss", "zzzs");
	}
	public static void match(String s1, String s2)
	{
		Boolean FLAG = true;
		int i,j;
		i=s1.length();
		j=s2.length();
		if(i==j)
		{
			for(int k = 0; k < i; k++)
			{
				for(int l = 0; l < i; l++)
				{
					if(s1.charAt(k)==s2.charAt(l))
					{
						FLAG = true;
					}
					else{
						FLAG = false;
					}
					break;
				}
			}
		}
		else{
			FLAG = false;
		}
		if(FLAG){
			System.out.println("Given String are anagram");
		}
		else{
			System.out.println("Given String are not anagram");
		}
	}
}
