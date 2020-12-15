package basicprograms;

public class Print1to10withoutLoop {
	static int count = 0;
	static void recurssiveme()  {
		count++;
			if(count<=10) {
			System.out.println(count);
			recurssiveme();
		}
	}
		
	public static void main(String[] args) {
		recurssiveme();
		
	}
	

}
