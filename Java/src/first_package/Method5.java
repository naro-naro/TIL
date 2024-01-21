package first_package;

public class Method5 {

	public static void main(String[] args) {
		System.out.println(randomNum());
	}
	
	
	public static int randomNum() {
		int n;
		n = (int)(Math.random()*100);
		return n;
	}

}
