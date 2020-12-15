package stringPrograms;

import java.util.Scanner;

public class stringspractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string and sub string");
		String str = scn.next();
		char[] strcha = str.toCharArray();
		String sstr = scn.next();
		int i = str.indexOf(sstr);
		int l = str.length();		
		if(i>0 && i<l) {
			//str =  str.substring(0,i-1)+str.substring(i+1);
			str = str.substring(0,i-1)+str.substring(i,l);
			StringBuilder s = new StringBuilder(str);
			char temp = strcha[i-1];
			s.insert(i,temp);
			System.out.println(s.toString());
		}
		else {
			str = str.substring(1,l-1) + strcha[0]+ str.substring(l-1);
			System.out.println(str);
		}
	}

}
