package first_package;

public class MethodMath5 {

	public static void main(String[] args) {
		// 최대값과 최소값
		int imax, imin;
		double dmax, dmin;
		
		// 최대값
		imax = Math.max(200, 300);
		dmax = Math.max(11.11, 22.22);
		System.out.println(imax + ", "+ dmax);
		
		// 최소값
		imin = Math.min(200, 300);
		dmin = Math.min(11.11, 22.22);
		System.out.println(imin + ", "+ dmin);
		
		
		
		// 난수
		double rannum;
		// 0.0에서 1.0 미만의 난수
		rannum = Math.random();
		System.out.println(rannum);
	}

}
