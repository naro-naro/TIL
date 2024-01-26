package dailyquiz.Jan26;

public class Question9 {

	public static void main(String[] args) {
        /* 9. 다음 코드는 변수 x, y, z의 값을 서로 바꾸는 예제입니다.
			아래 결과처럼 출력되도록 빈칸에 알맞은 코드를 넣어주세요.
			x = 20
			y = 300
			z = 1 */
		
		int x = 1;
        int y = 20;
        int z = 300;

        // 코드를 작성해주세요 
        int box;
        box = x; // box에 1 저장
        x = z; // x에 300 대입
        z = box; // z에 box에 저장해놨던 1 대입
        

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

	}

}
