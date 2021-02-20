package day7;
import java.util.Scanner;
public class ValidateAge {

	public static void main(String[] args) throws MyException {
	Scanner sc= new Scanner(System.in);
	int age=sc.nextInt();
	try {
		if(age<15) {
			throw new MyException("Invalid Age");
		}
		else {
			System.out.println("Valid Age");
		}
	}
	catch (MyException e) {
		System.out.println(e);
	}
	}}
	
	 class MyException extends Exception{
		public MyException(String s) {
			System.out.println(s);
		}
		
	}


