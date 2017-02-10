public class CarTester {

	public static final void main(String[] args) {

		Car myCar = new Car("Toyota","Tan", 1700);
		Car yourCar = new Car("Ford","White", 3100);
		System.out.println( "myCar" );
		System.out.println( myCar.getMake() );
		System.out.println( myCar.getColor() );
		
		System.out.println(" ");
		System.out.println( "yourCar" );
		System.out.println( yourCar.getMake() );
		System.out.println( yourCar.getColor() );
		System.out.println(" ");
		
		System.out.println( "mycar initial mileage" );
		System.out.println( myCar.getMileage() );
		System.out.println(" ");
		
		//move car 200 miles
		System.out.println( "update mileage" );
		myCar.move(200);
		System.out.println( myCar.getMileage() );
		System.out.println(" ");
		
		//move car 100 miles
		System.out.println( "update mileage" );
		myCar.move(100);
		System.out.println( myCar.getMileage() );
		System.out.println(" ");
		
		//move car 10 miles
		System.out.println( "update mileage" );
		myCar.moveTheCar();
		System.out.println( myCar.getMileage() );
		

	}


}
