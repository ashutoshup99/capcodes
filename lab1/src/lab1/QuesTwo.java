package lab1;

import java.util.Scanner;

public class QuesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter light color :");
		String str = sc.nextLine();
		switch(str) {
		case "Red" : 
		System.out.println("Stop");
		break;
		case "Yellow": System.out.println("Ready!!");
		break;
		case "Green": System.out.println("GO!");
		break;
		default: System.out.println("Invalid Input??");
		}
		} 
			
		}

	

