package com.jeet.oops;
//Q: Can we call protected instance variable inside static method.
//A: yes
public class StaticTest {
protected int i = 2; 
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println(st.i);
	}

}
