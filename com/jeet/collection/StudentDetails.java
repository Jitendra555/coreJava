package com.jeet.collection;

import java.util.ArrayList;
import java.util.List;

/*Compesite question hiring for swiggy */

public class StudentDetails {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student("Jitendra", 001, 30));
		listStudent.add(new Student("Mahendra", 002, 70));
		System.out.println("Student Details:"+listStudent);
	}
}
class Student{
	private String name;
	private int rollNo;
	private int marks;
	
	public Student(String name,int rollNo,int marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return  "("+name+"," +  rollNo+"," +  marks+")";
	}
}