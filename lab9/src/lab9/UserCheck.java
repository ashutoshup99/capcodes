package lab9;

import java.util.Scanner;

public class UserCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter job");
		String s=sc.nextLine();
		int i=s.indexOf("_");
		boolean res=validate(s,i);
		System.out.println(res);

	}

	private static boolean validate(String s, int i) {
		String s1=s.substring(0, i);
		if (s1.length()<8) {
			return false;
		}
		else {
			return true;
			}
	}

}
