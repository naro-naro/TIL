package dailyquiz.Feb06;

// 잔고 부족 예외 선언
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		
	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
