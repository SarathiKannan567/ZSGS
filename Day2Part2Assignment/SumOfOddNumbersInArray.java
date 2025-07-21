//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

package com.Day2Part2Assignment;
import java.util.Scanner;

public class SumOfOddNumbersInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		int sum=0;
		for(int i:ar) if(i%2!=0) sum+=i;
		System.out.println(sum);
		sc.close();
	}

}
