//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ages[]=new int[n];
		for(int i=0;i<n;i++) ages[i]=sc.nextInt();
		
		int younger=0;
		int adults=0;
		int older=0;
		for(int i:ages) {
			if(i<18) younger++;
			else if(17<i && i<61) adults++;
			else older++;
		}
		System.out.println("No. of <18 people is : "+younger);
		System.out.println("No. of 18-60 people is : "+adults);
		System.out.println("No. of >60 people is : "+older);
		sc.close();
	}

}
