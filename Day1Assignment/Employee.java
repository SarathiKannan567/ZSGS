package com.Day1Assignment;

public class Employee {
	int empId;
	String name;
	String department;
	double salary;
	Employee(int empId, String name, String department, double salary){
		this.empId=empId;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee employee=new Employee(1,"SarathiKannan.S","SoftwareDeveloper",50000);
		System.out.println("ID is "+employee.empId);
		System.out.println("Name is "+employee.name);
		System.out.println("Department is "+employee.department);
		System.out.println("Salary is "+employee.salary);
	}

}
