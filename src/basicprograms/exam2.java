package basicprograms;

import java.util.ArrayList;
import java.util.List;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int sum = 0, d, num=0, finalsum=0;
	        int n = 0;
	        n= A.length;
	        int[] sumA = new int[n];
	        List<Integer> finalSum = new ArrayList();
	        boolean found = false;
	        for(int i=0; i<A.length; i++){
	            num = A[i];
	            sum=0;
	            while(num>0){
	                d=num%10;
	                sum = sum + d;
	                num = num/10;
	            }
	            sumA[i]=sum;
	        }
	        for (int j=0; j<A.length; j++){
	            for(int k =0; k<A.length ;k++){
	                if(sumA[j] == sumA[k]){
	                    found = true;
	                    finalsum = A[j] + sumA[k];
	                    finalSum.add(finalsum);
	              
	                }
	            }
	        }
	        if(!found) {
	        	return -1;
	        }
			return finalsum;
	    }
}
