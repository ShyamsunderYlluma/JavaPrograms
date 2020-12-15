package stringPrograms;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String str1;
		System.out.println("Program Name: Reverse a String\nEnter a string:");
        Scanner sc  = new Scanner(System.in);
        str1 = sc.next();
        System.out.println("Recurssive String reverse: "+StringReverse.RecurssiveReverseString(str1));
		char[] arrstr = str1.toCharArray();
		String tmp = "";
		for (int i=arrstr.length-1; i>=0; i--) {
			//System.out.println(arrstr[i]);
			tmp = tmp+arrstr[i];
		}
		System.out.println("Reverse String is: "+tmp);
		StringReverse.StringReverseUsingStringBuffer(str1);
	}
	public static void StringReverseUsingStringBuffer(String str) {
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String using String Buffer: "+reverse);
	}
	public static String RecurssiveReverseString(String str) {
		if(str.length()<2) {
			return str;
		}
			return RecurssiveReverseString(str.substring(1)) +str.charAt(0);
	}
	
}
