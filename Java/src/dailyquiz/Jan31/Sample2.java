package dailyquiz.Jan31;

class Calculator1{
	static int result = 0; // 객체 생성
	
	static int add(int num) {
		result += num; // 객체에 입력받은 수 더하기
		return result; // 반환
	}
}



class Calculator2{ // Calculator1과 완전히 같은 기능의 클래스 또 생성
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}



public class Sample2 {

	public static void main(String[] args) {
        System.out.println(Calculator1.add(5)); // 0+5
        System.out.println(Calculator1.add(4)); // 0+5+4

        System.out.println(Calculator2.add(1)); // 0+1
        System.out.println(Calculator2.add(10)); // 0+1+10
	}
}