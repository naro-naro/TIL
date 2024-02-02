package dailyquiz.Feb01;

public class Movie extends Item {
	String director;
	String actor;
	
	Movie(int id, String name, int price, String director, String actor){
		super(id, name, price);
		this.director = director;
		this.actor = actor;
	}
	
	void printmovie() {
		System.out.println(String.format(", director:%s , actor:%s",director, actor));
	}
}
