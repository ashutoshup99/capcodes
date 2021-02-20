package day5;

public class ContractEmployee extends Employee {
	int salary=18000;

	@Override
	public int calculateSalary() {
		return salary;
	}

	public ContractEmployee(int id, String name) {
		super(id, name);
	}

	
	
	
}
