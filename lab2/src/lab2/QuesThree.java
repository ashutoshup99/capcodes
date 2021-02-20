package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elemnets ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int res[]=getSorted(a,n);
		System.out.println("Resulting array " + Arrays.toString(res));
	}

	 static int[] getSorted(int[] a,int n) {
		// TODO Auto-generated method stub
		 int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        }
	     Arrays.sort(b);
		 return b;
	}

}
