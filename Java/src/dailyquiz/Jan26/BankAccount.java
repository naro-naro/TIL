package dailyquiz.Jan26;

public class BankAccount {

	public static void main(String[] args) {
		long balance = 10000000000L; // 계좌 잔액
		long deposit = 5000000000L; // 입금
		
		balance += deposit; // 잔액에 입금액 합산
		
		System.out.println("입금이 완료되었습니다. 현재 잔액은 " + balance + "원입니다.");

	}

}
/*
 * long : 은행 계좌 잔액 처리
 * 은행 시스템에서 사용자의 계좌 잔액을 처리할 때 큰 금액을 다루므로 long 타입을 사용한다.
 */