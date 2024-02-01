package dailyquiz.Jan31;

public class Animal {
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	void sleep() {
	System.out.println(name + "가 자고있다.");
	}
}
