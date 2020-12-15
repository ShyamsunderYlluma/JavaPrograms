package stringPrograms;

import java.util.Scanner;

public class SearchSubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: Search for a substring in a String\nPlease enter the string and sub string");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String substr = scn.next();
		boolean flag = false;
		
		//1st way finding it with contains method
		/*flag = str.contains(substr);
		if(flag) {
			System.out.println(str+" String contains the " +substr +" substring");
		}
		else {
			System.out.println("No match found for the substring");
		} */
		
		//***********2nd way, finding it with indexOf() method****//
		/*int index = str.indexOf(substr);
		if(index==-1) {
			System.out.println("No match found for substring ");
		}
		else {
			System.out.println("Match found for the substring at an index "+index);
		}
		*/
		
		//3rd way finding it with lastIndexOf() method
		int index = str.lastIndexOf(substr);
		if(index==-1) {
			System.out.println("No match found for substring ");
		}
		else {
			System.out.println("Match found for the substring at an index "+index);
		}

}

}
