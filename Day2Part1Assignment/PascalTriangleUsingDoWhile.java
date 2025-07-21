package com.Day2Part1Assignment;

import java.util.Scanner;

public class PascalTriangleUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int[] prev={};
		do{
			int i=0;
			int ar[]=new int[row];
			while(i<row) {
				if(i==0 || i==row-1) {
					System.out.print("1 ");
					ar[i]=1;
				}
				else {
					ar[i]=prev[i-1]+prev[i];
			        System.out.print(prev[i-1]+prev[i]+" ");
				}
				i++;
			}
			prev=ar;
			System.out.println("");
		}while(row++<n);
		sc.close();
	}

}
