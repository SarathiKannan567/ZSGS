package com.Day2Part1Assignment;

import java.util.Scanner;

public class MatrixPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int rowLength=0;
		do{
			if(rowLength*rowLength>=str.length()) break;
			rowLength++;
		}while(true);
		
		int row=1;
		int i=0;
		do{
			int column=1;
			do{
				System.out.print(str.charAt(i++)+" ");
			}while(column++<rowLength);
			System.out.println("");
		}while(row++<rowLength);
	}

}
