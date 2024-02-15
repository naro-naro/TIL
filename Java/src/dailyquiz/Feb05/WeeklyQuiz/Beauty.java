package dailyquiz.Feb05.WeeklyQuiz;

class Beauty extends Product {
	public Beauty(String name, int price, double weight) {
		super(name, price, weight);
	}
	
	@Override
	public int getDiscountAmount() {
		return 10000;
	}
}
