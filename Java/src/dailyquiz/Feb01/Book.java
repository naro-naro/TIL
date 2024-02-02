package dailyquiz.Feb01;

public class Book extends Item {
	
	String author;
	String isbn;
	
	Book(int id, String name, int price, String author, String isbn){
		super(id, name, price); // 부모로부터 물려받은 요소
		this.author = author;
		this.isbn = isbn;
	}
	
	void printbook() {
		System.out.println(String.format(", author:%s, isbn:%s", author,isbn));
	}
}
