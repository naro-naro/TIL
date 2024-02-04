package dailyquiz.Feb02.interface1;

//동물들에게 먹이주는 클래스
class ZooKeeper {
	
	void feed(Tiger t1) {
		// 호랑이가 오면 고기를 던져 준다.
		System.out.println("feed meat");
	}
	
	void feed(Lion l1) {
		// 사자가 오면 생선을 던져 준다.
		System.out.println("feed fish");
	}
	
	void feed(Crocodile c1) {
		// 악어가 오면 딸기를 던져 준다.
		System.out.println("feed strawberry");
	}
	
	void feed(Leopard leo1) {
		// 표범이 오면 오렌지를 던져 준다.
		System.out.println("feed orange");
	}
}