package chapter6_4;

public class Company {
	
	private static Company instance  = new Company(); // 단 한개 생성 내부에서 사용
	
	private Company() {  //private 선언을 하면 외부 호출 불가
	
	}
	public static Company getInstance() {  // static으로 선언하면 객체 생성하지 않고 class 이름으로 접근 가능해진다
		if(instance == null)
			instance = new Company();
		return instance;
	}

}
