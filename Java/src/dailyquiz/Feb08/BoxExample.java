package dailyquiz.Feb08;

public class BoxExample {

	public static void main(String[] args) {
		Box2<String> box1 = new Box2<>();
		box1.set("Hello");
		
		String str = box1.get();
		System.out.println(str);
		

		Box2<Integer> box2 = new Box2<>();
		box2.set(9);
		
		int value = box2.get();
		System.out.println(value);
	}

}
