package dailyquiz.Feb05;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle taxi1 = new Taxi();
		Vehicle bus1 = new Bus();

		driver.drive(taxi1);
		driver.drive(bus1);
		
		Vehicle vehicle1 = new Bus(); // Vehicle을 Bus로 자동타입변환
		Vehicle vehicle2 = new Taxi(); // Vehicle을 Taxi로 자동타입변환
		
		driver.drive(vehicle1);
		driver.drive(vehicle2);
	}

}
