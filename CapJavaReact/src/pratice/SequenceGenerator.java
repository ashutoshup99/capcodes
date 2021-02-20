package pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGenerator {

	public static void main(String[] args) {
		System.out.println("Enter Sequence type: ");
		Scanner sc = new Scanner( System.in );
        String input = sc.nextLine();
		System.out.println("Enter sequence limit number: ");
		int n=sc.nextInt();
		List<Integer> res=generate(input,n);
		System.out.println(res);

        
	}

	private static List<Integer> generate(String input, int n) {
		String s1=input;
		switch(s1) {
		case "SquareSequence":
			SquareSequence ss=new SquareSequence();
			List<Integer> result=ss.next(input,n);
			return result;
		case "RandomSequence":
			RandomSequence rs=new RandomSequence();
			List<Integer> result1=rs.next(input,n);
			return result1;
		case "PrimeSequence":
			PrimeSequence ps=new PrimeSequence();
			List<Integer> result2=ps.next(input,n);
			return result2;
		default:
			System.out.println("enter correct Sequence");
			break;
		}
		return null;
	}

}
