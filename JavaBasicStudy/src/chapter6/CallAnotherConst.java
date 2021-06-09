package chapter6;

class Person{
	
	String name;
	int age;
	
	public Person() {
//		name = "�̸�����";
//		age = 1;
		this("�̸�����", 1); //ȣ�� �Ҷ� ������ Ÿ���� ������ �´� �����ڰ� ȣ��ȴ�
		
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println(p1.returnSelf());
	}

}
