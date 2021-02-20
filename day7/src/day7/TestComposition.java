package day7;

public class TestComposition {

	public static void main(String[] args) {
		Address address = new Address(12, "Jangpura", "New Delhi");
		
		Employee emp = new Employee(12, "Ravi", 23433.34, address);
		
		System.out.println(emp);
		
		emp.incrementSalary();
		
		System.out.println(emp);
		
//		emp.getAddress().setHouseNumber(1212);
		
		
		Address newAddress = new Address(4545, "Magarpatta", "Pune");
//		emp.address.changeAddress(newAddress); // use to access when we haven't define getter and setter
		
		emp.getAddress().changeAddress(newAddress);
		emp.setAddress(newAddress);
		
		
	
		
		System.out.println(emp);
	}

}
