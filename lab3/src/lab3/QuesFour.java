package lab3;

import java.util.Scanner;

public class QuesFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
    	int s = sc.nextInt(); 
        int result=modifyNumber(s);
        System.out.println(result);
	}
	public static int modifyNumber(int s) {
		String str1 = Integer.toString(s);
		StringBuffer sb=new StringBuffer();
		sb.append(str1);
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<sb.length()-1;i++) {
			char ch=sb.charAt(i);
			int a=Integer.parseInt(String.valueOf(ch));
			char ch1=sb.charAt(i+1);
			int b=Integer.parseInt(String.valueOf(ch1));
			int d=Math.abs(a-b);
			sb1.append(d);
		}
		sb1.append((sb.charAt(sb.length()-1)));
		String st=sb1.toString();
		int res=Integer.valueOf(st);
		return res;
	}

}
