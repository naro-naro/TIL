package dailyquiz.Feb13;

abstract class Pokemon{
	// 포켓몬이라는 이름을 가진 포켓몬은 없기 때문에 추상클래스로 생성
	
	private String name = "피카츄";
	private int level;
	private int exp = 0;
	private int hp;
	
	public Pokemon(int level) {
		this.level = level;
		this.hp = level * 20;
	}
	
	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		this.hp = level * 20;
	}
	
	public void expUp(int exp) {
		this.exp +=exp;
		while (this.exp >= 100) {
			this.exp -= 100;
		}
	}
	
	public void levelUp() {
		level++;
		hp = level * 20;
		System.out.println(name + "이(가) 레벨업을 하여 " + level + "레벨이 되었습니다!");
	}
	
	public void move() {
		System.out.println(name + "이(가) 움직입니다.");
	}
	
	public void jump() {
		System.out.println(name + "이(가) 점프합니다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getHp() {
		return hp;
	}
}

class Pikachu extends Pokemon{
}

class Squirtle extends Pokemon{	
}

class Charmander extends Pokemon{
}

class Lapras extends Pokemon{
}

class Metapod extends Pokemon{
}

class Main {

	public static void main(String[] args) {
        Pikachu pikachu1 = new Pikachu(5);
        Pikachu pikachu2 = new Pikachu("번개돌이", 5);

        pikachu1.jump();
        pikachu1.expUp(300);

        pikachu2.move();
        pikachu2.expUp(230);
	}

}
