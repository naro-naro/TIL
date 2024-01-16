package first_package;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nn, aa[] = new int[10];
		nn = aa.length;		// .length：アレーの長さ
		aa[nn-1] = 1234;
		System.out.println(nn-1+ " " +aa[nn-1]);
	}

}
