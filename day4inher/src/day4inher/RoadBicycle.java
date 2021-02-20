package day4inher;

public class RoadBicycle extends Bicycle {
	
	public RoadBicycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoadBicycle(int speed, int wheels, int gear, double mileage) {
		super(speed, wheels, gear, mileage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + ", wheels=" + wheels + ", gear=" + gear + ", mileage=" + mileage + "]";
	}

	@Override
	public void speedup(int speed) {
		// TODO Auto-generated method stub
		this.speed=speed+1;
	}
	
}
