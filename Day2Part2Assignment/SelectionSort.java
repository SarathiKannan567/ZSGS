//7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

package com.Day2Part2Assignment;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int weight[]=new int[n];
		for(int i=0;i<n;i++) weight[i]=sc.nextInt();
		
		for(int i=0;i<weight.length-1;i++) {
			int max=weight[i];
			int index=i;
			for(int j=i+1;j<weight.length;j++) {
				if(weight[j]>max) {
					max=weight[j];
					index=j;
				}
			}
			weight[index]=weight[i];
			weight[i]=max;
		}
		
		for(int i:weight) System.out.print(i+" ");
		sc.close();
	}

}
