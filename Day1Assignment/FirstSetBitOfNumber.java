package com.Day1Assignment;

public class FirstSetBitOfNumber {

	public static void main(String[] args) {
		int n=10;
		int bit=n&1;
		int count=1;
		while(bit!=1) {
			n=n>>1;
			bit=n&1;
			count++;
		}
		System.out.println(count);
	}

}
