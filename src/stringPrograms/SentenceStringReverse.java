package stringPrograms;

import java.util.Scanner;

public class SentenceStringReverse {
	public static void main(String[] args) {
		String str;
		System.out.println("Program Name: Reverse a Setenace of string\nEnter a Sentence of string:");
        Scanner sc  = new Scanner(System.in);
        str = sc.next();
		String sstr [] = str.split(" ");
		String tstr = "";
		
		for(int j=0; j<sstr.length; j++) {
			//System.out.println(sstr[j]);
			char[] arrstr = sstr[j].toCharArray();
			String tmp2 = "";
			for (int k=arrstr.length-1; k>=0; k--) {
				//System.out.println(arrstr[i]);
				tmp2 = tmp2+arrstr[k];
			}
			tstr = tstr+" "+tmp2;
			//System.out.println(tmp2);
		}
		tstr = tstr.trim();
		System.out.println(tstr);

	}
}
