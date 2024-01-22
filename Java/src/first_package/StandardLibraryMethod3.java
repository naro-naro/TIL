package first_package;

public class StandardLibraryMethod3 {

	public static void main(String[] args) {
		// 8자리의 16진수 대문자 표현
		int i;
		String str;
		
		i = 65000;
		System.out.println("65000을 16진수로 변환 : " + Integer.toHexString(i).toUpperCase());
		
		str = "0000000" + Integer.toHexString(i).toUpperCase(); // 0000000FDE8, type:String
		str = str.substring(str.length()-8); // str을 11-8=3번째 문자부터 끝까지 슬라이싱
		
		System.out.println("65000을 8자리 16진수로 변환 : "+str);
	}

}
