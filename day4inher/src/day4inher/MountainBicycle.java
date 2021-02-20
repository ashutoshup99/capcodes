package day4inher;

public class MountainBicycle extends Bicycle {
	String suspension;
	public MountainBicycle(int speed, int wheels, int gear, double mileage, String suspension) {
		super(speed, wheels, gear, mileage);
		this.suspension = suspension;
	}


	@Override
	public String toString() {
		return "MountainBicycle [suspension=" + suspension + ", speed=" + speed + ", wheels=" + wheels + ", gear="
				+ gear + ", mileage=" + mileage + "]";
	}


	@Override
	public void speedup(int speed) {
		// TODO Auto-generated method stub
		this.speed+=(speed*2);
		
	}

}
