package chapter6;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this �ڱ� �ڽ��� �޸�
		//�� �ڵ忡�� this�� �����ϰ� �Ǹ� year�� �Ķ���ͷ� ���Ǵ� year�� �νĵȴ�.
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
