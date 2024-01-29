package dailyquiz.Jan29;

public class Question3 {

	public static void main(String[] args) {
		// 아래 코드의 출력값은 무엇일까요?
        int number = 10;
        
        int result1 = number + 1; // 11
        int result2 = number++; // num을 result2에 대입한 후 +1 : 10
        int result3 = number; // num(11)을 result3에 대입 : 11
        int result4 = --number; // num(11)에서 1빼고(10) result4에 대입 : 10
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

	}

}
