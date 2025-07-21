package com.Day2Part1Assignment;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<=n) {
			if(i%2==0) sum+=i++;
			else {
				i++;
				continue; 
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
