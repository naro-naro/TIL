package first_package;

public class If5 {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "WXYZ";
		
		//str1.equals(str2) : str1이 str2와 일치하는지
		if (s1.equals("ABCD")) {
			System.out.println(s1 + " == ABCD");
		}
		if (s1.equals(s2)) {
			System.out.println(s1 + " == " + s2);
		}

	}

}
