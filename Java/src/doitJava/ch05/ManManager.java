package doitJava.ch05;

public class ManManager {

	public static void main(String[] args) {
		Man man1 = new Man();
		
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.child = 3;
		
		System.out.println("age : " + man1.age);
		System.out.println("name : " + man1.name);
		System.out.println("isMarried : " + man1.isMarried);
		System.out.println("child : " + man1.child);

	}

}
