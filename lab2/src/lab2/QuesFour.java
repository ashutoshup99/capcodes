package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class QuesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter numbers of the Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array after modification are:");
		int a[];
		a=modifyArray(arr);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

	 static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		 Arrays.sort(arr);
			int j=0;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]!=arr[i+1])
					arr[j++]=arr[i];
			}
			arr[j++]=arr[arr.length-1];
			int []a=new int[j];
			for (int i=0;i<j;i++) {
				a[i]=arr[j-1-i];
			}
			return a;
	}

}
