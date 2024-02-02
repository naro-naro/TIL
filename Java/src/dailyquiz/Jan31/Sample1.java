package dailyquiz.Jan31;

class Calculator {
    static int result = 0; // 객체 생성

    static int add(int num) {
        result += num; // result에 입력받은 수를 더하기
        return result;
    }
}


public class Sample1 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5)); // 0+5
        System.out.println(Calculator.add(4)); // 0+5+4
    }
}