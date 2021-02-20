package day5;

public class RegularEmployee extends Employee {
	int salary=1000;
	int payPerDay;
	public RegularEmployee(int id, String name,int payPerDay) {
		super(id, name);
		this.payPerDay=payPerDay;
	}

	@Override
	public int calculateSalary() {
		return payPerDay*salary;
	}

}
