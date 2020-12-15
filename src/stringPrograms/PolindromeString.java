package stringPrograms;

import java.util.Scanner;

public class PolindromeString {

	public static void main(String[] args) {
		System.out.println("Program Name: Polindrome string\nEnter a string:");
        Scanner sc  = new Scanner(System.in);
        String str1 = sc.next();
		char[] arrstr = str1.toCharArray();
		String tmp = "";
		for (int i=arrstr.length-1; i>=0; i--) {
			//System.out.println(arrstr[i]);
			tmp = tmp+arrstr[i];
		}
		if(str1.equalsIgnoreCase(tmp)){
			System.out.println(str1+" is a palindrome");
		}
		else{
			System.out.println(str1+" is not a palindrome");
		}
	}

}
