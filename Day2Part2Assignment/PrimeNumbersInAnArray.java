//2.Write a program to take in 10 values and print only those numbers which are prime.

package com.Day2Part2Assignment;
import java.util.Scanner;

public class PrimeNumbersInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		for(int i:ar) {
			if(i==1) continue;
			boolean isPrime=true;
			for(int j=2;j<i;j++) if(i%j==0) {
				isPrime=false;
				break;
			}
			if(isPrime) System.out.println(i+" is a PrimeNumber");
		}
		sc.close();
	}

}
