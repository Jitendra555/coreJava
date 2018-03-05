package com.jeet.coreJava;

public class StarterThread {
public static void main(String args[]) {
	Thread t1 = new Thread(new FirstThread());
	Thread t2 = new Thread(new SecondThread());
	t1.start();
	t2.start();
}
}
