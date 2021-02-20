package day4inher;

public abstract class Bicycle {
	int speed;
	int wheels;
	int gear;
	double mileage;
	public Bicycle(int speed, int wheels, int gear, double mileage) {
		super();
		this.speed = speed;
		this.wheels = wheels;
		this.gear = gear;
		this.mileage = mileage;
	}
	public Bicycle() {
		super();
	}
	
	public abstract void speedup(int speed);
	public void speedown(int speed) {
		this.speed-=speed;
	}
	public void changegear(int gear) {
		this.gear+=gear;
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", wheels=" + wheels + ", gear=" + gear + ", mileage=" + mileage + "]";
	}
	
	

}
