package dailyquiz.Jan31;

public class Student {
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void sleep() {
		System.out.println(name + " 학생이 자고 있습니다zzZ");
	}
}
