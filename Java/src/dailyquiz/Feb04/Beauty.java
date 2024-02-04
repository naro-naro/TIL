package dailyquiz.Feb04;

class Beauty extends Product implements DeliveryChangeCalculator {
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
		} 
		System.out.println(DC);
		
		if ((price>=30000) && (price < 100000)) {
			DC -= 1000;
		} 
		System.out.println(DC);
		
		if (price >= 100000) {
			DC = 0;
		}
		return DC;
	}
}
