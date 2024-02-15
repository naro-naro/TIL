package dailyquiz.Feb05;

public class Driver {
	public void drive(Vehicle vehicle) { // 구현 객체 vehicle
		
		// instanceof로 어떤 구현 객체가 인터페이스 타입으로 변환되었는지 확인
		if (vehicle instanceof Bus) {
			System.out.println("Bus//");
		}
		
		if (vehicle instanceof Taxi) {
			System.out.println("Taxi//");
		}
		
		vehicle.run(); // 구현 객체의 run() 메소드가 실행됨
	}
}
