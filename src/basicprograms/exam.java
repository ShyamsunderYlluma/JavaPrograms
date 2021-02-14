package basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		System.out.println("Final value : "+exam.solution(N));
		
	}
	public static int solution(int N) {
        // write your code in Java SE 8
        int temp = N;
        int d, sum=0, digsum=0, x=1, finalN=N;
        boolean found = false;
        while (N>0){
            d = N%10;
            sum = sum + d;
            N = N/10;
        }    
        for(int i = 1; i<=x ; i++){
            int nextInt = temp + 1;
            temp = nextInt;
            digsum = 0;
            while(nextInt>0){
                 d = nextInt %10;
                 digsum = digsum + d;
                 nextInt = nextInt/10;   
            }
            if(sum==digsum){
                found = true;
                finalN = temp;
                break;
            }
            else{
                x=x+1;
            }

        }
        return finalN;

    }

}
