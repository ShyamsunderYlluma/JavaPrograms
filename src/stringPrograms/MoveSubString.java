package stringPrograms;

import java.util.Scanner;

public class MoveSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program Expectation: If substring match found in the string, then move the substring position to the left by 3 indexes and print. Else Print no match found
		
		System.out.println("Program Name: Search for a substring in a String\nPlease enter the string and sub string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String substr = scn.next();
		boolean flag = false;
		String[] splitString;
		flag = str.contains(substr);
		String strFinal="", fstr1="", fstr2="", str1="", str2="";
		
		if(flag) {
			System.out.println(str+" String contains the " +substr +" substring");
			splitString = str.split(substr);
			int subStrIndex = str.indexOf(substr);
			str1 = splitString[0];
			str2 = splitString[1];
			int index = subStrIndex-substr.length();
			for(int i =0; i<str.length()-1; i++) {
				if (i<index){
					fstr1 = fstr1 + str1.charAt(i);
				}
				else if (i>=index && i< subStrIndex){
					fstr2 = fstr2 + str1.charAt(i);
				}
				
			}
			System.out.println("Final string is "+ fstr1+substr+fstr2+str2);
		}
		else {
			System.out.println("No match found for the substring");
		} 
		
	}

}
