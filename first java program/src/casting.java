public class casting {

	public static void main(String[] args) {
		Object emp5 = new Employee(12, "Ravi", 7964.33);
		Object emp6 = new Employee(17, "harry", 5453.33);
		Employee emp12 = new Employee(12, "Rahul", 33333.33);
		Object obj2 = new String("test");
		Object obj1 = emp12;    	// UPCASTING
		Employee emp = (Employee)obj1;  //Downcasting
		System.out.println(emp);
		Employee emp7 = new Employee(15, "ashok", 5675.33);
		Object obj = emp7; // UPCASTING
		System.out.println(obj);
		if(emp5 instanceof Object) {
			System.out.println("emp5 instance of object yes");
		}
		
		if(emp5 instanceof Employee) {
			System.out.println("emp5 instance of employee yes");
		}
		
		if(obj1 instanceof Object) {
			System.out.println("obj1 instance of object yes");
		}
		
		if(obj1 instanceof Employee) {
			System.out.println("obj1 instance of employee yes");
		}
		//downcasting
		if(emp instanceof Employee) {
			System.out.println("Type cast..");
			Employee empnew = (Employee)obj1;
			System.out.println(empnew);
		}
	}

}
