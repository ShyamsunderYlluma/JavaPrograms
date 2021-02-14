package Practice;
import java.util.*;

public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		if(isAnagram(str1, str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] s2Char = s2.toCharArray();
		for(char c:s2Char) {
			int index = s1.indexOf(c);
			if(index != -1) {
				s1 = s1.substring(0,index) + s1.substring(index+1, s1.length());
			}
			else {
				return false;
			}
		}
		return s1.isEmpty();
	}

}
