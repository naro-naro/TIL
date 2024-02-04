package dailyquiz.Feb02.interface3;

class Tiger extends Animal implements Predator {
	@Override
	public String getFood() {
		return "meat";
	}
}
