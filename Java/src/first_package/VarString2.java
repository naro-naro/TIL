package first_package;

public class VarString2 {
	public static void main(String[] args) {
		
		String s1, s2, s3, s4;
		
		s1 = "aaaa";
		s2 = s1;
		s3 = s1 + "BBBB"; // Ùþí®ÖªÖ§Ì¿ªÎæÑß©í­£«
		s4 = s3 + "1234";
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
	}
}
