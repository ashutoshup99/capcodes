package lab1;

import java.util.Scanner;

public class QuesSeven {
	 static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
	boolean flag=false;
	int cd=n%10;
	n=n/10;
	while(n>0) {
		if(cd<=n%10) {
		flag=true;
		break;
		}	
		cd=n%10;
		n=n/10;
		}
	return flag;
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		boolean f=checkNumber(n);
		if(f){
	         System.out.println("Digits are not in increasing order.");
	     }else{
	         System.out.println("Digits are in increasing order.");
	     }


	}

	

}
