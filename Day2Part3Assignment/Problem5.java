/*   5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by 
deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
‌*/

package com.Day2Part3Assignment;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		int k=0;
		boolean tr=true;
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=k;j<t.length();j++) {
				if(t.charAt(j)==s.charAt(i)) {
					count+=1;
					k=j+1;
					break;
				}
			}
			if(count!=1) {
				tr=false;
				break;
			}
		}
		if(tr) System.out.println(true);
		else  System.out.println(false);
		sc.close();
	}

}
