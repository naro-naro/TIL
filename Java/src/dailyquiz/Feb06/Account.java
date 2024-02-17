package dailyquiz.Feb06;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	// 입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 메소드
	public void withdraw(int money) throws BalanceInsufficientException{ // 사용자 정의 예외 떠넘기기
		if (balance < money) {
			throw new BalanceInsufficientException("잔고가 부족합니다!!" + (balance - money) + "원 부족합니다..."); // 사용자 정의 예외 발생
		}
		
		balance -= money;
	}
}
