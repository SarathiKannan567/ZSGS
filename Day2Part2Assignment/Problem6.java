/*  6. Write a program to accept the year of graduation from school as an integer value from the users . 
  Using the Binary search technique on the sorted array of integers given below . 
  Output the message “record exists" if the value input is located in the array and if not output the message record does not exists”.
  {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2020} */

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int n=sc.nextInt();
		int records[]=new int[n];
		for(int i=0;i<n;i++) records[i]=sc.nextInt();
		
		boolean found=false;
		int start=0;
		int end=records.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(records[mid]==year) {
				found=true;
				break;
			}
			if(records[mid]<year) start=mid+1;
			else end=mid-1;
		}
		if(found) System.out.println("record exists");
		else System.out.println("record does not exists");
		sc.close();
	}

}
