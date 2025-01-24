package JcScanner;

import java.util.Scanner;
public class JcPactice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,b,c;
   Scanner input = new Scanner(System.in);
   System.out.print("a에 해당하는 정수값을 입력하세요.");
	a=input.nextInt();
	System.out.print("b에 해당하는 정수값을 입력하세요.");
	b=input.nextInt();
	c=a+b;
	System.out.println(c);
	}

}
