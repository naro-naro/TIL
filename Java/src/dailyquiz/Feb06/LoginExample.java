package dailyquiz.Feb06;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String pw) throws NotExistIdException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIdException("존재하는 아이디가 아닙니다!");
		}
		
		if(!pw.equals("12345")) {
			throw new WrongPasswordException("잘못된 패스워드입니다!");
		}
	}
}
