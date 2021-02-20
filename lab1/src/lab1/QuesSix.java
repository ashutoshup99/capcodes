package lab1;

import java.util.Scanner;

public class QuesSix {
	 static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		 int d1=calcsquare(n);
		 int d2=calcupto(n);
		return Math.abs(d1-d2);
	}

	  static int calcupto(int n) {
		// TODO Auto-generated method stub
		int s=0;
		  for(int i=1;i<=n;i++) {
			s+=i;
		}
		  return s*s;
	}

	static int calcsquare(int n) {
		return (n * (n + 1) * (2 * n + 1)) / 6; 
		// TODO Auto-generated method stub
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));

	}

	

}
