package dailyquiz.Feb02;

// Dog의 자식클래스
public class HouseDog extends Dog{
	void sleep(int hour) {
		// 메소드 오버로딩 : 같은 이름인데 매개변수만 다른 메소드
		System.out.println(this.name + " Zzz... for " + hour + "hour");
	}
	
	public static void main(String[] args) {
		HouseDog dog1 = new HouseDog();
		
		dog1.setName("흰둥이");
		dog1.sleep();
		dog1.sleep(3);

	}

}
