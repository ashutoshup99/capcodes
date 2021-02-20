package prat;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=8;
//		System.out.println();
		j=9;
		int k=i/j;
		try{if(k==0) {
			throw new MyException("Exception aa gya bro!!!!!!");
			
		}
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		}
	}


class MyException extends Exception{

	public MyException(String string) {
		super(string);
	}
}
