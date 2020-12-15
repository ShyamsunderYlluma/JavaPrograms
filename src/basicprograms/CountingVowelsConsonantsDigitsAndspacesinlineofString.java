package basicprograms;

import java.util.Scanner;

public class CountingVowelsConsonantsDigitsAndspacesinlineofString {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scn = new Scanner(System.in);
		String str2 = scn.nextLine();
		
		int nu=0;
		int cons=0;
		int vow=0;
		int spc=0;
	
		//char[] arrstr = str2.toCharArray();
		 
		for(int i=0;i<str2.length();i++){
			
			char c = str2.charAt(i);
			
			if (c>'0' && c<'9'){
				nu++;
			}
			
			else if(c=='a' || c =='e' || c=='i' || c=='o' || c=='u')
			{
				vow++;
			}
			else if (c>='a' && c<='z'){
				cons++;
			}
			else if (c==' '){
				spc++;
			}
			
		}
		System.out.println("number of digits in the given string are "+nu);
		System.out.println("number of consonants in the given string are "+cons);
		System.out.println("number of vowels in the given string are "+vow);
		System.out.println("number of spaces in the given string are "+spc);
		
	}

}
