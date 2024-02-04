package dailyquiz.Feb04;

class LargeAppliance extends Product implements DeliveryChangeCalculator {
	int DC;
	
	@Override
	public int getDeliveryChange(int weight, int price) {
		
		if (price < 30000){
			if (weight >= 10) {
				DC = 10000;
			} else if (weight >= 3) {
				DC = 5000;
			} else {
				DC = 1000;
			}
		} else if (price < 100000) {
			DC = 5000;
		} else {
			DC = 0;
		}
		return DC;
	}
}
