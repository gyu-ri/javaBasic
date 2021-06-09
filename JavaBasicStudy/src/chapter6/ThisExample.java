package chapter6;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this 자기 자신의 메모리
		//위 코드에서 this를 생략하게 되면 year는 파라미터로 사용되는 year로 인식된다.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
		System.out.println(b2);
		b2.printThis();
	}

}
