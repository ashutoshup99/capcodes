package day4inher;

public class Testinh {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Bicycle m1= new MountainBicycle(10, 2,0,50.0,"shock");
		System.out.println(m1);
		m1.speedown(2);
		System.out.println(m1);
		Bicycle r1= new RoadBicycle(10, 2,0,50.0);
		System.out.println(r1);
		Bicycle m2=new MountainBicycle(10, 2,0,50.0,"Linkage"); //super type referencing sub type
		System.out.println(m2);
		Bicycle bicycles[] = {m1,r1,m2};
		for(Bicycle b : bicycles) {
			System.out.println(b);
			b.speedup(2);
			b.changegear(5);
			System.out.println(b);
		}
//		MountainBicycle m3=(MountainBicycle) new Bicycle(10, 2,0,50.0); //error
//		System.out.println(m3);
	}

}
