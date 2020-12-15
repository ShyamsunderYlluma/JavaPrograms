package basicprograms;

import java.util.Scanner;

public class LCMofTwoNumber {

	public static void main(String[] args) {
	      int n1, n2 = 18, lcm;
	      System.out.println("Program Name: LCMofTwoNumbers\nEnter two Numbers:");
	        Scanner sc  = new Scanner(System.in);
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();

	        lcm = (n1 > n2) ? n1 : n2;  // shorthand if operator .

	        while(true)
	        {
	            if( lcm % n1 == 0 && lcm % n2 == 0 )
	            {
	                System.out.printf("The LCM of %d and %d is %d", n1, n2, lcm);
	                break;
	            }
	            ++lcm;
	        }
	
	}

}
