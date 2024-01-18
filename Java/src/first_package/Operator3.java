package first_package;

public class Operator3 {

	public static void main(String[] args) {
		int a,b;
		
		a = 5;
		a = a+1; // a=6
		++a;	 // a=7
		a++;	 // a=8
		System.out.println("a = "+a);
		
		b = 10;
		b = b-1; // b=9
		--b;	 // b=8
		b--;	 // b=7
		System.out.println("b = "+b);
		
		b = ++a; // b = (a+1) == 8+1 = 9 : a=9
		// a에 +1한 뒤 b에 대입
		System.out.println("b = "+b);
		
		b = a++; // b = a -> a+1 : b=9, a=10
		// b에 a를 대입한 뒤 a에 +1
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
