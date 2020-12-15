package stringPrograms;

import java.util.*;


public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: Print first Non repeating char in String\nEnter a string");
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		FirstNonRepeatingChar.firstNonRepeatingChar(str);
		
	}
	public static void firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>(); 
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) { 
			char letter = word.charAt(i); 
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter); 
			} 
			else {
				nonRepeating.add(letter);
			} 
		} 
		if(nonRepeating.isEmpty()) {
			System.out.println("Non repeating letter not found in the string");		
		}
		else {
			System.out.println("Non repeating first letter is: "+nonRepeating.get(0)); 
		}
	}

}
