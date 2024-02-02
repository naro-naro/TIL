package dailyquiz.Jan31;

public class Car {
	String company; // 필드 = 멤버변수
	String model;
	int maxSpeed;
	// String company = "Kia"; 필드 초기화
	
	/*
	Car(){ // 생성자에서 필드 초기화
		company = "Hyundai";
	}
	*/
	
	// company를 입력받는 생성자
	Car(String company){
		this.company = company;
	}

	Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	
	Car(String company, String model, int maxSpeed){
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	// String 입력받고 리턴은 없음(void)
	void setModel(String model) {
		this.model = model;
	}
	
	
	public static void main(String[] args) {
		Car sonata = new Car("Hyundai"); //객체 생성
		Car k7 = new Car("Kia");
		Car sm5 = new Car("RenoSamsung");
		// 클래스에 의해 만들어진 객체 k7~9는 인스턴스이다
		
		System.out.println(k7.company);
	}

}
