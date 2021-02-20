import java.util.Scanner;
import java.util.Scanner;

public class Emplyeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp[] = new Employee[3];
		Employee emp1=new Employee(11,"Ashu",4555);
		Employee emp2=new Employee(12,"Aarav",7555);
		Employee emp3=new Employee(13,"Abhi",6555);
		Employee []emp= {emp1,emp2,emp3};
		emp[0]=emp1;
		emp[1]=emp2;
		emp[2]=emp1;
		Scanner sc = new Scanner(System.in);
		String s="Ashu";
		System.out.println(s);
		System.out.println("Enter the id :");
		int n = sc.nextInt();
		for(Employee e:emp) {
			if(e.getId()==n) {
				System.out.println("valid id");
			}
		}
		System.out.println("Enter the name :");
//		String s1=sc.nextLine();
		
		for(Employee e:emp) {
			if(e.getName().equals(s)) {
				System.out.println("valid Name");
			}
		}
		System.out.println("Usong for each loop");
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("Now using for loop");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		System.out.println("Incrementing Salary");
		for(Employee e:emp) {
			System.out.println(e);
			e.incrementSalary();
			System.out.println(e);
		}
		
//		System.out.println(emp.name);
//		System.out.println(emp.id);
//		//accessing fields
//		emp.name = "Ashu";
//		emp.id = 23;
//		emp.salary = 5000.00;
//		emp.password="AXIS";
//		System.out.println(emp.name);
//		System.out.println(emp.id);
//		emp.incrementsalary();
//		
//		System.out.println(emp.salary);
//		Employee emp2 = new Employee(34,"rain", "Priya", 34343.33);
//		Employee emp3 = new Employee(2,"sum", "Rajat", 44343.33);
//		
//		System.out.println(emp2.name);
//		System.out.println(emp3.name);
//		
//		System.out.println(emp2.toString());

	}

}
