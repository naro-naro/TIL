package dailyquiz.Feb04;

public class OrderManager {

	public static void main(String[] args) {
		
		Beauty blusher = new Beauty();
		blusher.setName("dior bulsher");
		blusher.setPrice(70000);
		blusher.setWeight(1);
		int DCBl = blusher.getDeliveryChange(blusher.weight, blusher.price);
		System.out.println("Delivery Change of " + blusher.getName() + " : " + DCBl);
		
		
		Grocery banana = new Grocery();
		banana.setName("delmonte banana");
		banana.setPrice(5000);
		banana.setWeight(2);
		int DCBa = banana.getDeliveryChange(banana.weight, banana.price);
		System.out.println("Delivery Change of " + banana.getName() + " : " + DCBa);
		
		
		LargeAppliance tv = new LargeAppliance();
		tv.setName("samsung tv");
		tv.setPrice(500000);
		tv.setWeight(30);
		int DCT = tv.getDeliveryChange(tv.weight, tv.price);
		System.out.println("Delivery Change of " + tv.getName() + " : " + DCT);
	}

}
