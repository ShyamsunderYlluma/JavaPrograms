package basicprograms;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n, i = 2, x = 2,count=1;

		System.out.printf("Please enter the nth prime number you want to find: ");
		n = input.nextInt();

		while(count<=n) {
			for (x = 2; x < i; x++) {
				if (i % x == 0) {
					break;
				}
			}
			if (x == i) {
				count++;
			}
			i++;
		}
		System.out.println(x);
	}

}
