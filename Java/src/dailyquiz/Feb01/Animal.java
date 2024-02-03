package dailyquiz.Feb01;

// 부모 클래스
public class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println(this.name + " Zzz...");
	}
}
