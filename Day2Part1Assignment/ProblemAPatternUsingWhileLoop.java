package com.Day2Part1Assignment;

import java.util.Scanner;

public class ProblemAPatternUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int count=1;
		int space=n/2;
		boolean down=false;
		int j=1;
		while(i<=n) {
			if(space==0) down=true;
			int k=0;
			while(k++<space) System.out.print("  ");
			k=0;
			while(k++<j) System.out.print(count+++"   ");
			System.out.println();
			if(down) {
				space++;
				j--;
			}
			else {
				space--;
				j++;
			}
			i++;
		}
		sc.close();
	}

}
