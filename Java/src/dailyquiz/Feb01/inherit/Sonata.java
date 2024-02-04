package dailyquiz.Feb01.inherit;
// Feb01/Car.java와는 다른 패키지

import dailyquiz.Feb01.Car;

public class Sonata extends Car { // Car를 상속

	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		System.out.println(sonata.company);
		// 상속한 클래스의 protected 변수는 접근 가능
		
		System.out.println(sonata.info);
		// public은 패키지가 다른 클래스에서도 sonata.info 접근이 가능하다
	}

}
