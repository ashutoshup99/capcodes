package lab3;
import java.util.Scanner;
public class QuesTwo {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	String s = sc.nextLine(); 
        String result=getImage(s);
        System.out.println(result);
	}
	public static String getImage(String s) {
		StringBuffer sb = new StringBuffer();
        sb.append(s);
        StringBuffer sb1 = new StringBuffer();
        sb1.append(sb);
        sb1.append(sb.reverse());
        sb1.insert(sb.length(), "|");
		String str = sb1.toString();
		return str;
	}
	
}

