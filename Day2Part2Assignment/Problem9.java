/*  9. Write an array which takes in roll no and marks in 3 subjects for 10 students.
Format and Print the roll no, total marks and average for all students in a table form. */

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n*4];
		int j=0;
		for(int i=0;i<n;i++) {
			ar[j++]=sc.nextInt();
			ar[j++]=sc.nextInt();
			ar[j++]=sc.nextInt();
			ar[j++]=sc.nextInt();
		}
		System.out.println("|    Roll No.    |     Total Marks    |     Average     |");
		for(int i=0;i<ar.length;i+=4) {
			int total=ar[i+1]+ar[i+2]+ar[i+3];
			System.out.println("|    "+ar[i]+"           |     "+total+"            |     "+total/3+"          |" );
		}
		sc.close();
	}

}
