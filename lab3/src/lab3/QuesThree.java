package lab3;
import java.util.Scanner;
public class QuesThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String ");
		String s = sc.nextLine(); 
    	s.toLowerCase();
    	String result=alterString(s.toCharArray());
        System.out.println(result.toUpperCase());
}
	static boolean isConsonant(char ch) 
    { 
        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u'){ 
            return false; 
        } 
        return true; 
    } 
public static String alterString(char[] s) {
	for(int i=0;i<s.length;i++) {
		if(isConsonant(s[i])) {
			if (s[i] != 'z')  
            { 
                s[i] = (char)(s[i]+1); 
            }
			else {
				s[i]='a';
			}
			
		}
		
	}
	return String.valueOf(s);
	}
}
