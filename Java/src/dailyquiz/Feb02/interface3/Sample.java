package dailyquiz.Feb02.interface3;

public class Sample {
	public static void main(String[] args) {
		ZooKeeper zk1 = new ZooKeeper();
		
		Tiger t1 = new Tiger();
		zk1.feed(t1);
		
		Lion l1 = new Lion();
		zk1.feed(l1);
	}
}
