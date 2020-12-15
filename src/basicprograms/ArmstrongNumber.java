package basicprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a,n,temp;  
		Scanner scn = new Scanner(System.in);
		System.out.println("Programe Name: Armstrong Number\nEnter number");
		n = scn.nextInt();		
	      
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10; // n = 153 a = 3     5  
	    n=n/10;  // n = 153 n =15   1
	    c=c+(a*a*a);  // c = 27  125  1 
	    }  
	    if(temp==c)  
	    System.out.println("It is an Armstrong number");   
	    else  
	        System.out.println("Not an Armstrong number");   
	   }  


}
