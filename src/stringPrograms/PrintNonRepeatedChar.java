package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: Print the Non repeated chars in a string\nEnter a string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		FindNonRepeatedCharCount(str);
	}
	public static void FindNonRepeatedCharCount(String str) {
		char[] charstr = str.toCharArray();
		Map<Character, Integer> count = new LinkedHashMap<>(str.length());
		boolean flag = false;
		for(char c: charstr) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}
			else {
				count.put(c,1);
			}
		}
		for(Entry<Character, Integer> entry : count.entrySet()) {
			if(entry.getValue() <2) {
				System.out.printf("%s : %d \n", entry.getKey(), entry.getValue());
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("All characters are repeating atleast once");
		}
		
	}
}
