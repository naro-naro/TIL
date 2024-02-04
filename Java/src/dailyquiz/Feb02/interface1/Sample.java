package dailyquiz.Feb02.interface1;


public class Sample {

	public static void main(String[] args) {
		ZooKeeper zk1 = new ZooKeeper();
		
		Tiger t1 = new Tiger();
		zk1.feed(t1);
		
		Lion l1 = new Lion();
		zk1.feed(l1);
		
		Crocodile c1 = new Crocodile();
		zk1.feed(c1);
		
		Leopard leo1 = new Leopard();
		zk1.feed(leo1);

	}
}