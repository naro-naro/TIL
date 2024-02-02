package dailyquiz.Feb01;

public class Album extends Item {
	String artist;
	
	Album(int id, String name, int price, String artist){
		super(id, name, price);
		this.artist = artist;
	}
	
	void printalbum(){
		System.out.println(String.format(", artist:%s",artist));
	}
}
