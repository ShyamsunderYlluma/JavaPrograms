package basicprograms;

public class BiggestNumberinArraywithoutsorting {

	public static void main(String[] args) {
		int [] array1 = {52, 25, 75, 100, 42, 54, 86};
		int pos=0;
		boolean found = false;
		/*while ( pos < array1.length && !found){
			if(array1[pos]==searchedvalue){			
			found = true;
					}
		else{
			pos++;
		}
		}*/
		
		int temp = 0;
		for(int i=0; i< array1.length ; i++){
			if(array1[i]>temp){
				temp = array1[i];
				pos = i;
			}
		}
			
			System.out.println("found at position: "+pos);
			System.out.println("Biggest number in the array is "+temp);
		
		
		}
}
