package learnings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File(".\\src\\textfile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st = br.readLine()) != null){ // will read entire line
			System.out.println(st);
		}
		
		FileReader fr = new FileReader(file);
		int i;
		while((i=fr.read()) != -1) { // this will read each char and return its acci value. 
			System.out.print((char) i);
		}
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			//System.out.println(sc.nextLine());
			st = sc.nextLine();
			String[] stob  = st.split(" ");
			for(String s:stob) {
				if(s.equalsIgnoreCase("Automation")){
				System.out.println("Found value: "+ s);
				}
			}
		}
		
		
	}

}
