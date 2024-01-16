package first_package;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aa[] = {100, 200, 300};
		double bb[] = {11.1, 22.22, 33.333};
		String cc[] = {"aaaa", "bbbb", "cccc"};
		
		System.out.println("aa[0] = " + aa[0] + ", aa[1] = " + aa[1] + ", aa[2] = " + aa[2]);
		System.out.println("bb[0] = " + bb[0] + ", bb[1] = " + bb[1] + ", bb[2] = " + bb[2]);
		System.out.println("cc[0] = " + cc[0] + ", cc[1] = " + cc[1] + ", cc[2] = " + cc[2]);
		System.out.println();
		
		int i;
		double total[] = new double[3];
		for(i=0; i<=2; i++) {
			total[i] = aa[i] + bb[i];
			System.out.println(i + "st is " + total[i]);
		}
	}

}
