package lab1;

import java.util.Scanner;

public class QuesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count = 0;
			
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println(i);
			}
			
		}
	}

}
