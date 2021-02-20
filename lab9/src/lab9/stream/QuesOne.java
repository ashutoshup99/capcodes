package lab9.stream;
@FunctionalInterface
interface Power 
{ 
    int calcPower(int a, int b); 
} 
public class QuesOne {

	public static void main(String[] args) {
		Power obj = (int x,int y)->{
			long result = 1;

	        for (;y != 0; --y)
	        {
	            result *= x;
	        }
	        return (int) result;
		};
		System.out.println("Result: "+obj.calcPower(3,3));
	}

}
