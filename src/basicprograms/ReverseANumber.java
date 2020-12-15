package basicprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Name: Reverse a Number\nEnter the number below:");
		num = sc.nextInt();

        while(num != 0) {
            int digit = num % 10;  // 1234   4    3  2
            reversed = reversed * 10 + digit;  //43
            num /= 10;  // 123
        }

        System.out.println("Reversed Number: " + reversed);
    }

}
