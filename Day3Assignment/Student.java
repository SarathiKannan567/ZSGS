/* 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' 
and that of name as "John" by creating an object of the class Student.  */

package com.Day3Assignment;

public class Student {
	String name;
	int roll_no;
	Student(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
	}
	public static void main(String[] args) {
		
		Student student=new Student("John",2);
		System.out.println("name is "+student.name);
		System.out.println("Roll_No is "+student.roll_no);
		}

}
