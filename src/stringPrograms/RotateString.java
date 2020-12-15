package stringPrograms;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: Rotate a String\nEnter a string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int m = str.length();
		System.out.println("Enter a substring or letter");
		String sstr= scn.next();
		int n = sstr.length();
		if(str.contains(sstr)) {
			int i = str.indexOf(sstr);
			str = str.substring(i) + str.substring(0, i);
			System.out.println("Rotated string is: "+ str);
		}
		else {
			System.out.println("No match found for the substring");
		}
		
		
		
		
		
	}

}
