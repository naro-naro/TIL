package dailyquiz.Feb02.interface2;

class ZooKeeper {
	/*
	- 변경 전
	void feed(Tiger t1) {
		System.out.println("feed meat");
	}
	*/
	
	// 변경 후
	void feed(Predator pre) {
		System.out.println("FEED MEAT");
	}
}
