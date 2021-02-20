package lab1;

import java.util.Scanner;

public class QuesEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		boolean f=checkNumber(n);
		if(f){
	         System.out.println("Number is power of two.");
	     }else{
	         System.out.println("Number is not power of two.");
	     }

	}

	 static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		 if (n == 0)
	            return false;
	         
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
		
	}

}
