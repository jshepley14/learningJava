public class Car {

	/* Instance Variables: */
	private String make;
	private String color;
	private int miles;

	/* Constructor */
	public Car(String ma, String c, int mileage) {
		make = ma;
		color = c;
		miles=mileage;
	}

	/* accessor methods */
	public String getMake() {
		return make;
	}

	
	public void move(int m) {
		miles+=m;
	}
	
	public void moveTheCar() {
		miles+=10;
	}

	
	public int getMileage() {
		return miles;
	}

	public String getColor() {
		return color;
	}


}
