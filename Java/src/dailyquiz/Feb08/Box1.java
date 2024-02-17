package dailyquiz.Feb08;

public class Box1 {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}

/*
 * 필드 타입이 Object : 필드에 모든 종류의 객체를 저장하고 싶어서
 * Object 클래스는 모든 Java 클래스의 최상위 부모 클래스
 * 모든 Java 객체는 Object 타입으로 자동 변환되어 저장된다
 * Object object = 자바의_모든_객체;
 * 
 * .get()으로 저장된 원래 타입의 객체를 얻으려면
 * Object 타입에서 강제 타입 변환을 해야 함
 */
