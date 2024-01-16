package first_package;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aa [] = new int[10];
		double bb [] = new double[10];
		String ss [] = new String[10];
		
		aa[6] = 12345;
		aa[2] = aa[6]+10000;
		System.out.println("aa[2] = " + aa[2] + ", aa[6] = " +aa[6]);
		
		bb[6] = 33.44;
		bb[2] = bb[6]+33300.00444;
		System.out.println("bb[2] = " + bb[2] + ", bb[6] = " +bb[6]);
		
		ss[6] = "abcde";
		ss[2] = ss[6]+"fghijk";
		System.out.println("ss[2] = " + ss[2] + ", ss[6] = " +ss[6]);
	}

}
