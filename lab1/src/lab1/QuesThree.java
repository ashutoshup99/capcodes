package lab1;

public class QuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1;
		int n2 = 1;
		int n3;
		int num = 0;
		
		int n = 7;
		
		for(int i=1;i<=n-2;i++) {
			
			num = n1+n2; 
			n1 = n2;
			n2 = num;
			
		}
		
		System.out.println("The " + n +"th digit is: "+ num);
		
		
		int res = RecursiveFib(n);
		System.out.println("The " + n +"th digit is: " + res);

	}

	private static int RecursiveFib(int n) {
		// TODO Auto-generated method stub
		int n1=1;
		int n2=1;
		
		if(n==1) {
			return n1;
		}
		else if(n==2) {
			return n2;
		}
		else {
			return RecursiveFib(n-1) + RecursiveFib(n-2);
		}
	}

}
