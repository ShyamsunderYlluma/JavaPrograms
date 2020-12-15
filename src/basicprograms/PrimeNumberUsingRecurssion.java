package basicprograms;

import java.util.Scanner;

public class PrimeNumberUsingRecurssion {

	public static void main(String[] args) {
		int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        PrimeNumberUsingRecurssion obj = new PrimeNumberUsingRecurssion();
        x = obj.P22PrimeNumberUsingRecurssion(n, 2);
        if(x == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }

	}
	int P22PrimeNumberUsingRecurssion(int y,int i)
    {
         if(i < y)
        {
            if(y % i != 0) 
            {
                return(P22PrimeNumberUsingRecurssion(y, ++i));
            } 
            else
            {
                return 0; 
            }
        }
        return 1;
    }

}
