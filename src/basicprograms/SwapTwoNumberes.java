package basicprograms;

import java.util.Scanner;

public class SwapTwoNumberes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Name: Swap two numbers without temp var\nEnter two numbers:");
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.printf("Numbers after swaping: n1 - %d ,n2 - %d ", n1, n2);
        
	}

}
