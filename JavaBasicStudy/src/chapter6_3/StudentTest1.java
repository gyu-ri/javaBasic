package chapter6_3;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ= new Student();
		System.out.println(studentJ.serialNum);
		System.out.println(studentJ.studentID);
		
	//	studentJ.serialNum++;

		Student studentT= new Student();
		System.out.println(studentJ.studentID);
		
		System.out.println(studentJ.serialNum);   //�ΰ� ����� ����  �� �ν��Ͻ��� ���� �ǰ� �ִ�
		System.out.println(studentT.serialNum);
	}

}
