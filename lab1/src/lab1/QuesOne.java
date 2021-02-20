package lab1;

import java.util.Scanner;

public class QuesOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Enter the number of digits:");
		int n = sc.nextInt();
		int res = cubeSum(n,num);
		System.out.print("The result is:");
		System.out.println(res);
	
	}

	 static int cubeSum(int n, int num) {
		// TODO Auto-generated method stub
		 int sum=0;
		 while(n>0) {
			 n--;
			 int r=num%10;
			 num=num/10;
			 int c=r*r*r;
			 sum+=c;
		 }
		return sum;
	}

}
