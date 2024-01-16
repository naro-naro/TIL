package first_package;

public class VarString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1, s2, s3; // 文字列型の変数（'S'tring : 大文字）
		
		s1 = "abcd"; // String文字列は二重引用符("")
		s2 = s1;
		s3 = s1 + "WXYZ";
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}

}
