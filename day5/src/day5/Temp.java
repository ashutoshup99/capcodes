package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Temp {
	
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
		highestTemp(a);
		averageTemp(a);
	}

	 static void highestTemp(int[] a) {
		// TODO Auto-generated method stub
		int max=a[0];
		for (int j = 1; j < a.length; j++) {
			if(a[j]>=max){
				max=a[j];
			}
		}
		System.out.println("Max is " + max);
	}

	 static void averageTemp(int[] a) {
		// TODO Auto-generated method stub
		 int avr=0;
		 int sum=0;
		 for (int j = 0; j < a.length; j++) {
				sum+=a[j];
			}
		System.out.println("Average temperature is " + sum/a.length); 
	}

}
