package com.Day2Part1Assignment;

import java.util.Scanner;

public class GradeForStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int precent=sc.nextInt();
		String grade="";
		//using if clause
		if(precent>=85 && precent<=100) grade="A";
		if(precent>=70 && precent<85) grade="B";
		if(precent>=50 && precent<70) grade="C";
		if(precent<50) grade="Fail";
		
		System.out.println("Grade "+grade);
		
		//using switch case
		switch(grade) {
		case "A":
			System.out.println("Grade A");
			break;
	    case "B":
	    	System.out.println("Grade B");
	    	break;
		case "C":
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Fail");
			break;
}
		sc.close();
	}

}
