package dailyquiz.Feb08;

import java.util.ArrayList;

public class GenericExample {
	public static void main(String[] args) {
		
		// 제네릭 사용 전
		ArrayList list1 = new ArrayList();
		list1.add("Hello");
		String str1 = (String) list1.get(0); 
		// list.get(i)의 타입은 Object이므로 String으로 타입 변환이 필요

		
		// 제네릭 사용 후
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Hello");
		String str2 = list2.get(0);
		// 타입 변환을 할 필요가 없음 -> 성능 업
	}

}