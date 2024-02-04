package dailyquiz.Feb02.interface3;

class ZooKeeper {
	/*
	 - 수정 전
	void feed() {
		System.out.println("FEED MEAT");
		// 어떤 포식자 개체가 오든 같은 메시지 출력
	}
	*/
	
	// 수정 후
	void feed(Predator pre) {
		System.out.println("feed " + pre.getFood());
	}

}
