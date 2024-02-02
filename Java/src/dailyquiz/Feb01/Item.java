package dailyquiz.Feb01;

public class Item {
	int id;
	String name;
	int price;
	
	Item(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void print() {
		System.out.print(String.format("id:%s, name:%s, price:%s", id,name,price));
	}
	
}
