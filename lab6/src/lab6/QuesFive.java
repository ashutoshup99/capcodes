package lab6;
import java.io.*; 
import java.util.*; 
public class QuesFive {
	public static void main(String[] args) {
	int arr[]= {112,324,325,345,545,754};
	int res=getSecondSmallest(arr);
	System.out.println(res);
	}

	private static int getSecondSmallest(int[] arr) {
		ArrayList al = new ArrayList(); 
		for(int i=0;i<arr.length;i++) {
        	al.add(arr[i]);
        }
		Collections.sort(al);
		System.out.println(al);
		int s= (int) al.get(1);
        return s;
	}
}
