package basicprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n, t1 = 0, t2 = 1;
        System.out.println("Program Name: Fibonacci Series\nEnter a Number:");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " , ");

            int sum = t1 + t2;
            t1 = t2; // 
            t2 = sum; // 
        }
	}

}
