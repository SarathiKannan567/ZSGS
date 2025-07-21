package com.Day1Assignment;

public class CheckPowerOf2OrNot {
	public static void main(String[] args) {
		int n=17;
		int sum=1;
		while(true){
			if(sum>=n) {
				if(sum==n) System.out.println(true);
				else  System.out.println(false);
				break;
			}
			sum=sum*2;
		}
	}

}
