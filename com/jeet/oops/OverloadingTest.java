package com.jeet.oops;

class Parent {
public void get(int i) {
	System.out.println("int");
}
}
class Child extends Parent {
public void get(float f) {
	System.out.println("float");
}
}
class test {
public static void main(String[] s) {
Child c = new Child();
//Parent p = new Parent();
//p.get(2);
c.get(2);
}
}