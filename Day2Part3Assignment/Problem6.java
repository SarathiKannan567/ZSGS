/*   6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌*/
package com.Day2Part3Assignment;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num1=sc.nextLine();
		String num2=sc.nextLine();
		int digit1=1;
		int val1=0;
		for(int i=num1.length()-1;i>=0;i--) {
			int c=num1.charAt(i)-48;
			val1+=digit1*c;
			digit1=digit1*10;
		}
		int digit2=1;
		int val2=0;
		for(int i=num2.length()-1;i>=0;i--) {
			int c=num2.charAt(i)-48;
			val2+=digit2*c;
			digit2=digit2*10;
		}
		String ans="";
		ans+=(val1+val2);
		System.out.println(ans);
		sc.close();
	}

}
