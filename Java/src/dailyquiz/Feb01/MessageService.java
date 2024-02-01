package dailyquiz.Feb01;

public class MessageService {
	static final String MESSAGE_FORMAT = "[회사명] %s님의 이용약관 개정 메시지입니다.";
	
	void send() {
		System.out.println(MESSAGE_FORMAT.formatted("name"));
	}
}
