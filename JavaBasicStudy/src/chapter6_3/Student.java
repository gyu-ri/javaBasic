package chapter6_3;

public class Student {
	
	static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() { 
		serialNum++;  //���� �ȴ�
		studentID = serialNum;  //�ν��Ͻ� ���� ���� ������ �ִ�
	}
}
