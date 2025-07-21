/* 1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌*/

package com.Day2Part3Assignment;

import java.util.Scanner;

public class StringProblem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int aValue=0;
		int power=1;
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i)=='1') aValue+=power;
			power*=2;
		}
		int bValue=0;
		int pow=1;
		for(int i=b.length()-1;i>=0;i--) {
			if(b.charAt(i)=='1') bValue+=pow;
			pow*=2;
		}
		int ans=aValue+bValue;
		String binaryVal="";
		while(ans>0) {
			binaryVal=ans%2+binaryVal;
			ans=ans/2;
		}
		System.out.println(binaryVal);
		sc.close();
	}

}
