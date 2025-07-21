package com.Day2Part1Assignment;

import java.util.Scanner;

public class FirstPatternProblemUsingForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int last=n-1;
		boolean centre=false; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==first || j==last) System.out.print("1");
				else System.out.print(" ");
			}
			if(first==last) centre=true;
			if(!centre) {
			first++;
			last--;
			}
			else {
				first--;
				last++;
			}
			System.out.println("");
		}
	}

}
