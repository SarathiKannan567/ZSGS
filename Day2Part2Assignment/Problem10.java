/*  10. Write a menu driven program to do following operation on two dimensional array A of size m x n.
    You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m  */

package com.Day2Part2Assignment;

import java.util.Scanner;

public class Problem10 {
	
	static void takeInput(int ar[][],int m,int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++) for(int j=0;j<n;j++) ar[i][j]=sc.nextInt();
		sc.close();
	}
	
	static void display(int ar[][],int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) System.out.print(ar[i][j]+" ");
			System.out.println("");
		}
	}
	
	static void sumOfElements(int ar[][],int m,int n) {
		int sum=0;
		for(int i=0;i<m;i++) for(int j=0;j<n;j++) sum+=ar[i][j];
		System.out.println("Sum Of Elements "+sum);
	}
	
	static void sumOfElementsByRowWise(int ar[][],int m,int n) {
		for(int i=0;i<m;i++) {
			int rowSum=0;
			for(int j=0;j<n;j++) rowSum+=ar[i][j];
			System.out.println("row "+(i+1)+" sum is "+rowSum);
		}
	}
	
	static void sumOfElementsByColumnWise(int ar[][],int m,int n) {
		for(int i=0;i<n;i++) {
			int columnSum=0;
			for(int j=0;j<m;j++) columnSum+=ar[j][i];
			System.out.println("column "+(i+1)+" sum is "+columnSum);
		}
	}
	
	static int[][] transposeOfMatrix(int ar[][],int m,int n) {
		int transposeMatrix[][]=new int[n][m];
		for(int i=0;i<m;i++) for(int j=0;j<n;j++) transposeMatrix[j][i]=ar[i][j];
		return transposeMatrix;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int A[][]=new int[m][n];
		takeInput(A,m,n);
		display(A,m,n);
		sumOfElements(A,m,n);
		sumOfElementsByRowWise(A,m,n);
		sumOfElementsByColumnWise(A,m,n);
		int B[][]=transposeOfMatrix(A,m,n);
		display(B,n,m);
		sc.close();
	}

}
