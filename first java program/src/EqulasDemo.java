
public class EqulasDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits[] = {"Apple", "Banana", "Orange"};
		Fruit f1 = new Fruit("Apple");
		Fruit f2 = new Fruit("Apple");
		Fruit f3=f2;
		System.out.println(f1.equals(f2));   //// CONTENT COMPARISION
		System.out.println(f1==f2);          /// reference COMPARISION
		System.out.println(f2==f3);
		System.out.println(f2.equals(f3));
		
		Employee e1=new Employee(11,"sam",345.9);
		Employee e2=new Employee(11,"sam",345.9);
		Employee e3=new Employee(14,"john",250.0);
		Employee e4=e3;
		
		System.out.println("--------------");
		System.out.println(e1.equals(e2));
		System.out.println(e4.equals(e3));
		System.out.println(e4==e3);
//		System.out.println("--------------");

//		Fruit fruits[]= {f1 , new Fruit("Banana"), new Fruit("Orange")};
//		
//		
//		int result = Arrays.binarySearch(fruits, new Fruit("Orange"));
//		
//		if(result>=0 ) {
//			System.out.println("Found at: " + result);
//			System.out.println(fruits[result]);
//		}
//		else {
//			System.out.println("Not found");
//		}
	}
		
	}
class Fruit{
	String name;
	String color;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	public boolean equals(Object obj) {
			Fruit f = (Fruit) obj;
	        return (this.name.equals(f.name));
	   }

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	

}
