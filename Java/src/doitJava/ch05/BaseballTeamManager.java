package doitJava.ch05;

public class BaseballTeamManager{
	
    public static void main(String[] args) {
        BaseballTeam twins = new BaseballTeam("LgTwins");
        BaseballTeam wiz = new BaseballTeam("KtWiz");
        BaseballTeam landers = new BaseballTeam("SsgLanders");
        // 이름을 매개변수로 받는 생성자로 만든 인스턴스 : twins, wiz, landers
        
        BaseballTeam dinos = new BaseballTeam();
        BaseballTeam bears = new BaseballTeam();
        // 디폴트 생성자로 만든 인스턴스 : dinos, bears
        
        BaseballTeam tigers = new BaseballTeam("KiaTigers", "Gwangju");
        BaseballTeam giants = new BaseballTeam("LotteGiants", "Busan");
        // 이름, 연고지를 매개변수로 받는 생성자로 만든 인스턴스 : tigers, giants
        
        BaseballTeam lions = new BaseballTeam("SamsungLions", "Daegu", 8);
        // 이름, 연고지, 우승횟수를 매개변수로 받는 생성자로 만든 인스턴스 : lions
    }
}
