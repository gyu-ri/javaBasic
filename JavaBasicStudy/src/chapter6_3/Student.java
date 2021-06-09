package chapter6_3;

public class Student {
	
	static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() { 
		serialNum++;  //공유 된다
		studentID = serialNum;  //인스턴스 마다 각각 가지고 있다
	}
}
