package JcWhile;

public class JcWhile4 {

	public static void main(String[] args) {
		int sum=0;
		int i=3;
		while(i<=10) {
			sum=sum+(int)Math.pow(i, 5);
			++i;
		}
System.out.println(sum);
	}

}
