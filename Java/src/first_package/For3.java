package first_package;

public class For3 {

	public static void main(String[] args) {
		int i, wa, seki;
		int dt[] = {1, 2, 3, 4, 5};
		
		wa = 0;
		seki = 1;
		
		for (i=1; i<=dt.length; i++) {
			wa = wa+dt[i-1];
			seki = seki*dt[i-1];
		}
		
		System.out.println("dt의 합 : "+wa);
		System.out.println("dt의 곱 : "+seki);
	}

}
