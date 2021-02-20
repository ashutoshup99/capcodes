package lab6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class QuesFour {
	public static void main(String[] args) {
		HashMap<Integer, Integer> mapStudent = new HashMap<>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter Reg number:");
			Integer regNumber = Integer.parseInt(scan.nextLine());
			System.out.print("Enter MArks:");
			int marks = scan.nextInt();
			Integer oldVal = mapStudent.put(regNumber, marks);
			if (oldVal!=null) {
				System.out.println("Student Id Number:" + regNumber + " is "
						+ oldVal + " and has been awarded by " + marks);
			}
			System.out.print("Enter another student (y/n)?");
			String answer = scan.nextLine();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (loopAgain);
		scan.close();
		System.out.println(mapStudent);
		Map<Integer, String> l=getStudents(mapStudent);
		 for (Map.Entry<Integer,String> i : l.entrySet())  
	            System.out.println("Reg. No. = " + i.getKey() + 
	                             ", Medal = " + i.getValue());
	}

	private static Map<Integer, String> getStudents(HashMap<Integer, Integer> mapStudent) {
		Map<Integer, String> resultMap = new HashMap<>();
		for(Map.Entry<Integer,Integer> i: mapStudent.entrySet()){
			if(i.getValue()>=90) {
				resultMap.put(i.getKey(),"Gold");
			}
			else if(i.getValue()>=80 && i.getValue()<90 ) {
				resultMap.put(i.getKey(),"Silver");
			}
			else{
				resultMap.put(i.getKey(),"Bronze");
			}
		}
		return resultMap;
	}
}
