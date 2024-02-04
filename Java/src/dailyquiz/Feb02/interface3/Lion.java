package dailyquiz.Feb02.interface3;

class Lion extends Animal implements Predator {
	@Override
	public String getFood() {
		return "fish";
	}
}
