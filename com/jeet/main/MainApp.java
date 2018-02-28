package com.jeet.main;

import java.util.List;

public class MainApp {

	
	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
class A{
	public static void m1(){
		System.out.println("hi"); 
	}
}
class B extends A{
	public static void m1(){
		System.out.println("hello"); 
	}
}
