package basicprograms;

import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to findout its Prime or not");
		int num = sc.nextInt();	
        boolean flag = false;
        for(int i = 2; i <= num/2; i++)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
