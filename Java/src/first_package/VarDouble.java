package first_package;

public class VarDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi, r, area;
		// double : 小数点型の変数
		
		pi = 3.14159;
		r = 10.0; // r = 10; のように整数を入力してもdouble型なのでr = 10.0となる。
		area = pi * r * r;
		System.out.println("円の面積は" + area +"です。");
	}

}
