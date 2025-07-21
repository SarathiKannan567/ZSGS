/*  8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.   */

package com.Day2Part3Assignment;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		int count=0;
		if(word.charAt(0)>='A' && word.charAt(0)<='Z') count++;
		for(int i=1;i<word.length();i++) {
			if(word.charAt(i)>='A' && word.charAt(i)<='Z') count+=1;
		}
		if(count==0 || count==1) System.out.println(true);
		else {
			if(count==word.length()) System.out.println(true);
			else System.out.println(false);
		}
		sc.close();
	}

}
