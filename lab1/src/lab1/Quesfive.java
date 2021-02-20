package lab1;

import java.util.Scanner;
import java.util.*;
public class Quesfive {
	 static int calculateSum(int n, int x, int y) {
		 int sum = 0;
		 while(n>0) {
			 if(n%x==0 || n%y==0) {
				 sum+=n;
				 n--;
			 }
			 else {
				 n--;
			 }
		 }
		 return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
        int X = 3, Y = 5; 
      
        System.out.println(calculateSum(n, X, Y));
	}

}
