package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class QuesOne {

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
		int result = getSecondSmallest(a,n);
		System.out.println("Second smallest element is " + result);
	}
	static int getSecondSmallest(int a[],int n) {
		int smallest = a[0];
		int second_smallest=0;		 
        Arrays.sort(a);
		return a[1];
		
	}

}
