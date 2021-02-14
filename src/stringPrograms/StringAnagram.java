package stringPrograms;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two strings can be called anagram if they contains the same chars but in a different order. Like mary, army
		System.out.println("Program Name: String anagram check\nPlease enter two strings");
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		char[] charstr1 = str1.toCharArray();
		char[] charstr2 = str2.toCharArray();
		int MatchCount = 0;
		if(str1.length() != str2.length()) {
			System.out.printf("%s and %s are not anagrams",str1, str2);
		}
		else{
			for(int i=0;i<str1.length(); i++) {
				for(int j=0; i<str2.length(); j++) {
					if(charstr1[i]==charstr2[j]) {
						MatchCount ++;
						break;
					}
				}
			}
			if(MatchCount==str1.length()) {
				System.out.printf("%s and %s are anagrams",str1, str2);
			}
			else {
				System.out.printf("%s and %s are not anagrams",str1, str2);
			}
		}
	}
}
