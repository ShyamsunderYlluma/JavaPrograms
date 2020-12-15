package basicprograms;

import java.util.Scanner;

public class maxmiumof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any three numbers below:");
		x = scn.nextInt();
		y = scn.nextInt();
		z = scn.nextInt();		
		  //NO two values shoudn't be equal
		if(x>y) {
			if(x>z) {
				System.out.println(x+" is bigger");
			}
			else {
				System.out.println(z+" is bigger");
			}
		}
		else {
			if(y>z) {
			System.out.println(x+" is bigger");
			}
		else {
			System.out.println(z+" is bigger");
		}
	}

	}

}
