package dailyquiz.Feb14;

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

/*
 * Object 타입을 모두 타입 파라미터 T로 바꿈
 * T는 객체 생성 시 지정한 타입으로 자동 변환된다.
 */