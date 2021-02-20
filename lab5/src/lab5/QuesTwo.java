package lab5;
import java.util.Scanner;
public class QuesTwo {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Name");
	String str1=sc.nextLine();
	System.out.println("Enter Last Name");
	String str2=sc.nextLine();
	try {
		validate(str1,str2);
		System.out.println("Valid Name!!!");
		}
	catch (MyException e) {
		System.out.println(e);
	}	
}

private static void validate(String str1, String str2) throws MyException {
		if(str2.isEmpty() || str1.isEmpty()) {
			throw new MyException("Invalid Name");
	}
}
}
