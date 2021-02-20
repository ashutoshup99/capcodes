public class varar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1);
		add(11,2,3,4);
		add(2,30);
		add(10,20,20,90);

	}

	 static void add(int ...a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("sum is "+" " +sum);
	}

}
