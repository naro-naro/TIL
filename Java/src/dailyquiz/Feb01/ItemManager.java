package dailyquiz.Feb01;

public class ItemManager {

	public static void main(String[] args) {
		Book book1 = new Book(1, "HarryPoter", 13000, "RowlingJK", "9780590353427");
		book1.print();
		book1.printbook();

		Album album1 = new Album(2, "Antifragile", 10000, "LESSERAFIM");
		album1.print();
		album1.printalbum();
		
		Movie movie1 = new Movie(3, "TheClassic", 15000, "GwakJaeyong", "SonYejin");
		movie1.print();
		movie1.printmovie();
	}

}
