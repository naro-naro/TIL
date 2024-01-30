package dailyquiz.Jan30;

public class Question1 {

	public static void main(String[] args) {
        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];
        
        // for문 작성하는 부분
        // …
        for (int i =0; i <a.length; i++) {
        	for (int j =0; j<a[i].length; j++) {
        		b [i][j] = a[i][j];
        	}
        }
        
        // a배열과 b배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }

	}

}
