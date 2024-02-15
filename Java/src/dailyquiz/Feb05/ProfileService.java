package dailyquiz.Feb05;

public class ProfileService {
	ProfileRepository repository;
	
	public void saveProfile() {
		repository = new ProfileDBRepository(); // 이 부분만 바꿔 끼우면 됨
		repository.save();
	}
}
