package basicprograms;

import java.util.Scanner;

public class StrongNumber 
{ 
	public static int fact(int i) 
    { 
        int f,j; 
        f=1; 
       for(j=i ;j>0;j--) 
            f=f*j; 
            return f; 
     } 
     public static void main(String args[]) { 
         int a,b,r,s=0; 
         Scanner sl=new Scanner(System.in); 
         System.out.println("Program Name: Strong Number\nEnter A Number"); 
         b=sl.nextInt() ; 
         a=b; 
         while(b>0) 
               { 
                   r=b%10;  //145   5 
                   s=s+StrongNumber.fact(r); // 
                   b=b/10; 
               } 
          if(a==s) 
             System.out.println(a+" is a strong number"); 
          else 
             System.out.println(a+" is not a strong number"); 
        } 
}
