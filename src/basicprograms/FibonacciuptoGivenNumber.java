package basicprograms;

import java.util.Scanner;

public class FibonacciuptoGivenNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n, t1 = 0, t2 = 1;
		System.out.println("Program Name: Fibonacci Series upto given number\nEnter a Number:");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        
        System.out.print("Fibonacci Series upto given number " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
}
