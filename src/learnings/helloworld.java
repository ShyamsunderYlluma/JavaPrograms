package learnings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import learnings.EnumExample.Season;

public class helloworld {

	public static void main(String args[]) throws Exception {
		System.out.println("Welcome to Java world");
		FinalKeyword fk = new FinalKeyword();
		System.out.println("X value: "+ fk.x);
		//fk.x = 10; // Can't override a variable value if it is defined with final access modifier.
		System.out.println("Max value: "+ FinalKeyword.max);
		for (Season s : EnumExample.Season.values()) {  
			System.out.println(s);  
		}
		
		//AbstractExample ab = new AbstractExample(); Can't create an object for Abstract class - Cannot instantiate the type AbstractExample
		
		
	}
	
	
	

}
