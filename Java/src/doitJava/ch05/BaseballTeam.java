package doitJava.ch05;

public class BaseballTeam{
// 야구팀을 코드로 구현하는 클래스
	
    String name;
    String hometown;
    int win;
    // 멤버변수들

    public BaseballTeam(String teamname) {
        name = teamname; 
        // 이름을 매개변수로 받는 생성자
    }
    
    public BaseballTeam() {
    	// 디폴트 생성자
    }
    
    public BaseballTeam(String teamname, String city) {
    	this.name = teamname;
    	this.hometown = city;
    	// this는 인스턴스 스스로를 가리키는 예약어
    	// 이름, 연고지를 매개변수로 받는 생성자
    }
    
    public BaseballTeam(String teamname, String city, int wins) {
    	this.name = teamname;
    	this.hometown = city;
    	this.win = wins;
    	// 이름, 연고지, 우승횟수를 매개변수로 받는 생성자
    }
}
// 위 경우처럼 클래스에 생성자가 두 개 이상 있는 것을 '생성자 오버로드'라고 한다