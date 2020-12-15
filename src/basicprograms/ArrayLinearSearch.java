package basicprograms;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		int [] array1 = {52, 25, 75, 100, 42, 54, 86};
		int searchedvalue = 100;
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
		for(int i=0; i< array1.length ; i++){
			if(array1[i]==searchedvalue){
				found = true;
				pos = i;
				break;
			}
		}
			
		if (found){
			System.out.println("found at position: "+pos);
		}
		else{
			System.out.println("Not found");
			
		}
		
	}

}
