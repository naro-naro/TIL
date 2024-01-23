package first_package;

public class SystemExit {

	public static void main(String[] args) {
		// 종료 메소드
		// 실행중인 프로그램을 강제 종료 : System.exit()
		// 파일이 열리지 않는 등의 중대한 에러가 발생했을 때 등의 상황에 사용
		
		System.out.println("Bye Java!");
		System.exit(1);
		// 1은 이 프로그램을 호출한 시스템으로 반환하는 값(Status code)

		System.out.println("This sentence will not be printed.");
	}

}
