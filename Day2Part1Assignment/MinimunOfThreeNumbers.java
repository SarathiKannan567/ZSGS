package com.Day2Part1Assignment;

import java.util.Scanner;

public class MinimunOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c) System.out.println("Minimum number is "+a);
		if(c<b && c<a) System.out.println("Minimum number is "+c);
		else System.out.println("Minimum number is "+b);
		sc.close();
		}

}
