package dailyquiz.Feb06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		// 예금하기
		account.deposit(30000);
		System.out.println("현재 잔액 : " + account.getBalance() + "원입니다.");
		
		// 출금하기
		try {
			account.withdraw(100000);
		} catch (BalanceInsufficientException e) {
			// 예외 발생 병로를 추적
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
