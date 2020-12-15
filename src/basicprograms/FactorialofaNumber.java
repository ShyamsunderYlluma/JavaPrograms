package basicprograms;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {
		int i,number,fact=1;  
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the number");
		  number = scn.nextInt();
				      
		  for(i=number;i>1;--i){    
		      fact=fact*i;    
		   }
		 // System.out.println(	i);
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

}
