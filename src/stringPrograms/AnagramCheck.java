package stringPrograms;

import java.util.Scanner;

public class AnagramCheck {
	public static boolean isAnagram(String word, String anagram)
	{ if(word.length() != anagram.length()) {
		return false; 
	} 
	char[] chars = word.toCharArray(); 
	for(char c : chars){ 
		int index = anagram.indexOf(c);
		if(index != -1){ 
			anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
		}
		else{ 
			return false; 
		} 
	} 
	return anagram.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: String anagram check\nPlease enter two strings");
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		if(AnagramCheck.isAnagram(str1, str2)) {
			System.out.printf("%s and %s are anagrams",str1, str2);
		}
		else {
			System.out.printf("%s and %s are not anagrams",str1, str2);
		}		
	}
}
