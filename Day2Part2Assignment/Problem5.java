/*   5. Write a program to initialize the following character arrays and 
   print a suitable message after checking the arrays whether the two arrays are identical or not.
   Make suitable use of Boolean data type.
    X[] ={'m', 'n', 'o', 'p'} and Y[] ={'m', 'n', 'o', 'p' } X[] ={'m', 'n', 'o', 'p'} and Y[] ={'m', 'n', 'o', 'p' }   */

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char x[]=new char[n];
		for(int i=0;i<n;i++) x[i]=sc.next().charAt(0);
		
		char y[]=new char[n];
		for(int i=0;i<n;i++) y[i]=sc.next().charAt(0);
		
		boolean identical=true;
		for(int i=0;i<n;i++) {
			if(x[i]!=y[i]) {
				identical=false;
				break;
			}
		}
		if(identical) System.out.println(true);
		else System.out.println(false);
		sc.close();
	}

}
