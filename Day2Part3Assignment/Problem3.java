/*  3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
‌*/

package com.Day2Part3Assignment;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss="";
		char ar[]=s.toCharArray();
		for(int i=0;i<ar.length;i++){
		    if(ar[i]=='a' || ar[i]=='e' || ar[i]=='i' || ar[i]=='o' || ar[i]=='u' || ar[i]=='A' || ar[i]=='E' || ar[i]=='I' || ar[i]=='O' || ar[i]=='U'){
		        ss+=s.charAt(i);
		        ar[i]='+';
		    }
		}
		int j=ss.length()-1;
		String ans="";
		for(int i=0;i<ar.length;i++){
		    if(ar[i]=='+') ar[i]=ss.charAt(j--);
		    ans+=ar[i];
		}
		System.out.println(ans);
		sc.close();
	}

}
