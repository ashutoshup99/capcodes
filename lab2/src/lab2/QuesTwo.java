package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class QuesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s= sortString(str);
		System.out.println("String after sorting and modification is:"+s);
		sc.close();

	}

	 static String sortString(String str) {
		// TODO Auto-generated method stub
		 String s1=str.toLowerCase();
			char arr[] = s1.toCharArray();
			Arrays.sort(arr);
			String s= new String(arr);	
			int size=s.length();
			int flag;
			if(size%2==0)
				flag=s.length()/2;
			else
				flag=(s.length()/2)+1;
			String str1="";
			for (int i=0;i<flag;i++) {
				str1=str1+Character.toLowerCase(s.charAt(i));
			}
			for (int i=flag;i<str.length();i++) {
				str1=str1+Character.toUpperCase(s.charAt(i));
			}
			return str1;
	}

}
