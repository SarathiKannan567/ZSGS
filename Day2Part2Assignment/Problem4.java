/*  4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. 
The function calculates sum of only single digit and sum of only double digit elements from the array. 
Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result 
by invoking the function print( ). */

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem4 {
	static void print(int[] x,int n) {
		int singleDigit=0;
		int doubleDigit=0;
		for(int i:x) {
			if(i<10 && i>-10) singleDigit+=i;
			if(i>9 && i<100 || i<-9 && i>-100) doubleDigit+=i;
		}
		System.out.println("Sum Of SingleDigits is "+singleDigit);
		System.out.println("Sum Of doubleDigits is "+doubleDigit);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		for(int i=0;i<n;i++) x[i]=sc.nextInt();
		print(x,n);
		sc.close();
	}

}
