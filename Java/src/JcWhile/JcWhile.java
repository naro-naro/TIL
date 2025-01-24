package JcWhile;

public class JcWhile {

	public static void main(String[] args) {
		int num1,num2,gcd,i;
		num1=6; num2=12;
		gcd=0;
		i=1;
		while(i<=num1) {
			if(num1%i==0&&num2%i==0) gcd=i;
			i++;
		}
System.out.println(gcd);
	}

}
