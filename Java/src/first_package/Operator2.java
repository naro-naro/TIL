package first_package;

public class Operator2 {

	public static void main(String[] args) {
		int idt;
		double ddt;
		
		System.out.println("----double형 계산----");
		ddt = 8.0/2.5;
		System.out.println("8.0/2.5 = " + ddt);
		ddt = 8.0%2.5;
		System.out.println("8.0%2.5 = " + ddt);
		
		System.out.println("----우선순위 확인----");
		idt = 1+2*3-4/2;
		System.out.println("1+2*3-4/2 = " + idt);
	}

}
