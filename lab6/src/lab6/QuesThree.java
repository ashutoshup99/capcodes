package lab6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class QuesThree {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of elements in array ");
	int n = sc.nextInt();
	System.out.println("Enter elements ");
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Map<Integer,Integer> l=getSquares(arr);
	for(Map.Entry<Integer,Integer> i: l.entrySet()){
		System.out.println("Key = " + i.getKey() +  
                ", Value = " + i.getValue());
	}	
}

	private static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> squareNum = new HashMap<>();
		for(Integer i:arr) {
			squareNum.put(i, i*i); 
		}
		return squareNum;
}}