package learnings;

abstract class AbstractExample {

	int y = 10;
	
	abstract void IamAbstractMethod();
	public static void ImNonAbstractMethod() {
		System.out.println("Am ImNonAbstractMethod from Abstract class");
	}
}
