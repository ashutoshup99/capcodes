package lab5;
//import com.cg.eis.exception;
import java.util.Scanner;
public class QuesThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Salary");
		int sal=sc.nextInt();
		try {
			validatesal(sal);
			System.out.println("Valid Salary!!!");
			}
		catch (MyException e) {
//			System.out.println(e);
		}	
	}
	private static void validatesal(int sal) throws MyException {
		if(sal<3000) {
			throw new MyException("Invalid Salary");
	}
}
}
class MyException extends Exception{
	public MyException(String s) {
		super();
}}

