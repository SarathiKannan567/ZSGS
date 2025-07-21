//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

package com.Day2Part2Assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		ar[0]=1;
		if(n>1) ar[1]=1;
		for(int i=2;i<n;i++) ar[i]=ar[i-1]+ar[i-2];
		for(int i:ar) System.out.print(i+" ");
		sc.close();
	}

}
