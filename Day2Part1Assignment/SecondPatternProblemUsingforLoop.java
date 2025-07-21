package com.Day2Part1Assignment;

import java.util.Scanner;

public class SecondPatternProblemUsingforLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean down=false;
		int r=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(down) {
					if(j==0 || j==r) System.out.print("R");
					else System.out.print(" ");
				}
				else {
				if(j==0 || j==n-1) {
					System.out.print("R");
				}
				else {
					if(i==1 || i==n/2) System.out.print("R");
					else System.out.print(" ");
				}
				}
			}
			if(i==n/2) {
				down=true;
			}
			System.out.println("");
		}
	}

}
