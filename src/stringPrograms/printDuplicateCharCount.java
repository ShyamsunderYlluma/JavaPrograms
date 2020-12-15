package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class printDuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program Name: Print the count of duplicate chars in a string\nEnter a string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		FindCountOfDuplicateChars(str);
		
	}
	public static void FindCountOfDuplicateChars(String str) {
		char[] charStr = str.toCharArray();
		// build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : charStr) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
        System.out.printf("List of duplicate characters in String '%s' %n", str);
        for (Map.Entry<Character, Integer> entry : entrySet){
        	if (entry.getValue() > 1) {
        	System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
        	} 
        }

        
	}

}
