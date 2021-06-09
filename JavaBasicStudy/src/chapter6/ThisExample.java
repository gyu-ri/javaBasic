package chapter6;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this 자기 자신의 메모리
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
