package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuesTwo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String ");
		String s = sc.nextLine(); 
		Map<Character, Integer> result = countChars(s.toCharArray());
		for(Map.Entry<Character, Integer> en: result.entrySet()) {
			System.out.println("Character = " + en.getKey() +  
                    ", Occurance = " + en.getValue()); 
		}
	}

	private static Map<Character, Integer> countChars(char[] charArray) {
		String s=String.valueOf(charArray);
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] strArray = s.toCharArray();
		for(char i:strArray) {
			if (charCountMap.containsKey(i)){
                charCountMap.put(i, charCountMap.get(i) + 1); 
            } 
            else { 
                charCountMap.put(i, 1); 
            } 
		}
		return charCountMap;
	}
}
