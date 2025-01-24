package Jcfor;

public class Jcfor3 {

	public static void main(String[] args) {
		
int num1,num2,gcd,i;
num1=6;
num2=12;
gcd=0;   
for(i=1; i<=num1; i=i+1) {
	if(num1%i==0&&num2%i==0)gcd=i;
}System.out.println(gcd);
	}

}
