package com.Day2Part1Assignment;

import java.util.Scanner;

public class SecondPatternProblemUsingforLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean down=false;
		int r=n/2-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(down) {
					if(j==0 || j==r) System.out.print("R ");
					else System.out.print("  ");
				}
				else {
				if(j==0 || j==n-2) {
					System.out.print("R ");
				}
				else {
					if(i==0 || i==n/2) System.out.print("R ");
					else System.out.print("  ");
				}
				}
			}
			if(i==n/2) down=true;
			if(down) r++;
			System.out.println("");
		}
	}

}
