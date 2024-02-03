package doitJava.ch05;

public class OrderManager {

	public static void main(String[] args) {
		Order order1 = new Order();
		
		order1.orderNumber = 202402030001L;
		order1.userId = "abc123";
		order1.orderDate = "2024-02-03";
		order1.userName = "최정";
		order1.productNumber = "PD0203-01";
		order1.userAddress = "인천광역시 미추홀구 문학동 482 인천SSG 랜더스필드";

		System.out.println("주문 번호 : " + order1.orderNumber);
		System.out.println("주문자 아이디 : " + order1.userId);
		System.out.println("주문 날짜 : " + order1.orderDate);
		System.out.println("주문자 이름 : " + order1.userName);
		System.out.println("주문 상품 번호 : " + order1.productNumber);
		System.out.println("배송 주소 : " + order1.userAddress);
	}

}
