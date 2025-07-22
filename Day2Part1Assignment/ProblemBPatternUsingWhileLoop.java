package com.Day2Part1Assignment;

import java.util.Scanner;

public class ProblemBPatternUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c=sc.next().charAt(0);
		boolean tr=false;
		int i=1;
		int rowLength=1;
		while(i<=n) {
			if(rowLength==(n/2)+1) tr=true;
			int j=0;
			while(j++<rowLength) System.out.print(c+" ");
			System.out.println("");
			if(tr) rowLength--;
			else rowLength++;
			i++;
		}
		sc.close();
	}

}
