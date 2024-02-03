package dailyquiz.Feb01;

public class Car {
	private int speed;
	
	protected String company = "Kia";
	// protected는 동일 패키지의 동일 클래스 또는 해당 클래스를 상속받은 클래스에서만 접근 가능
	
	public String info = "This is public message";
	// public은 어떤 클래스에서도 접근 가능
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	// speed 필드는 외부에서 직접 접근이 불가능하도록 막아놓고 (private)
	// Setter메소드로 speed값을 변경해주도록 공개(public)
	}
	
	public double getSpeed() {
		double km = speed * 1.6;
		return km;
	// 
	}
}