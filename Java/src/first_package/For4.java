package first_package;

public class For4 {

	public static void main(String[] args) {
		// 100 이하의 소수 찾기
		int i, n;
		
		for (n=2; n<=100; n++) {		// 2부터 100까지의 수를 1씩 늘려가며 판단할건데 
			for (i=2; i<=n/2; i++) {	// 판단할 수의 약수는 반보다 작아야 한다. 1씩 늘려서 나눠볼건데
				if (n%i == 0) break;	// 만약에 나누어 떨어지면(나머지가 0이면) 그 수는 소수가 아니니까 그만 알아보고 다음 n으로
			}
			if (i>n/2) {				// 약수가 n의 반절보다 커지면 그만하고 소수로 인정하고 출력한다
				System.out.print(n+" ");
			}
		}
	}

}
