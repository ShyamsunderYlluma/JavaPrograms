package basicprograms;

import java.util.Scanner;

public class HCFofTwoNumber {
	public static void main(String[] args) {
		int n1, n2, gcd = 1;
		System.out.println("Program Name: HCF of TwoNumbers\nEnter two Numbers:");
        Scanner sc  = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

		int k = (n1 < n2) ? n1 : n2;
        for(int i = 1; i <= k; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }

	

}
