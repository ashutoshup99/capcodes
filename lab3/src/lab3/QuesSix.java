package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class QuesSix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String ");
		String s = sc.nextLine(); 
		boolean result=check(s);
		System.out.println(result);
	}

	private static boolean check(String s) {
		int n=s.length();
		char[] st1=s.toCharArray();
		char[] st=s.toCharArray();
		Arrays.sort(st);
		for (int i = 0; i < n; i++)  {
            if (st1[i] != st[i])   
                return false; }
                
        return true;
	}

}
