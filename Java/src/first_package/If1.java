package first_package;

import java.util.Scanner;
public class If1 {

	public static void main(String[] args) {
		// 정가가 1000원 이상이라면 500원을 할인하고
		// 그렇지 않으면 50원을 할인하는 프로그램
		
		int price;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price : ");
		price = input.nextInt();
		
		/*
		 * if (조건1){
		 * 조건1을 만족할 떄의 실행문
		 * }
		 * else{
		 * 조건2을 만족하지 않을 때의 실행문
		 * }
		 */
		
		if(price>=1000) {
			price = price - 500;
		}
		else {
			price = price - 50;
		}
		// else문은 불필요할 경우 생략할 수 있다
		
		System.out.println("price : " + price);

	}

}
