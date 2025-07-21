package com.Day2Part1Assignment;

import java.util.Scanner;

public class PatternUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c=sc.next().charAt(0);
		
		int maxLengthRow=1;
		while(true) {
			if(maxLengthRow*maxLengthRow>=n) break;
			maxLengthRow++;
		}
		int i=1;
		int rowLength=1;
		boolean tr=false;
		while(i<=n) {
			int j=0;
			if(rowLength==maxLengthRow) tr=true;
			while(j++<rowLength) {
				if(c=='@') System.out.print(i+" ");
				else System.out.print(c+" ");
				i++;
			}
			System.out.println("");
			if(tr) rowLength--;
			else rowLength++;
		}
		sc.close();
	}

}
