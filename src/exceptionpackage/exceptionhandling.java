package exceptionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.omg.CORBA.ExceptionList;

public class exceptionhandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		exceptionhandling.method1();
	
	}
	public static void method1() {
		try {
			int d = 1/0;
			System.out.println("No error");
		}
		catch(Exception e){
			System.out.println("am handling exception. ");
			System.out.println("am running after exception occured. ");
			System.out.println("Am the exception " + e.getMessage());
			e.printStackTrace();
			throw new ArithmeticException("dividing a number by 0 is not allowed in this program");
			
		}
		finally {
			System.out.println("Am finally block");
			//throw ArithmeticException.class;
		}
	}
	public static void method2(){
		Properties prop;
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./config.properties");
			prop.load(ip);
			System.out.println("loaded files");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void method3() {
		int e = 1/1;
		System.out.println("Method 3, no error");
		throw new ArithmeticException("dividing a number by 0 is not allowed in this program");
	}
	public static void method4() throws IOException {
		System.out.println("Method 4  - IOException");
		throw new IOException("Loading file is failed");
	}
}
