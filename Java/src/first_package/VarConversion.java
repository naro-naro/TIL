package first_package;

public class VarConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 1.5;
		int inum = 3;
		
		dnum = inum;      // double型にint型を代入することはOK。-> 3.0
	//	inum = dnum;	     エラー。int型にdouble型を代入すると情報を失う。
		System.out.println(dnum);
		
		
		dnum = 1.5;
		inum = 3;
		inum = (int)dnum; // OK。dnumをint型に変換してinumに代入。-> 1
		System.out.println(inum);
		
		
		double d1,d2 = 345.678;
		d1 = (int)d2;	 // 整数部のみ -> 345
		System.out.println(d1);
		
		
		int num1 = 65;
		char ch = (char)num1;		// int値をchar型に変換して変数num1に代入
		System.out.println(num1);	// num1出力 -> 65
		System.out.println(ch);		// 文字コード65のA出力 -> A
		System.out.println((int)ch);// char型chをまたint型に変換して出力 -> 65
	} 

}
