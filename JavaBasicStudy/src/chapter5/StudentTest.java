package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��⵵ ȭ���� �ݼ۵�";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "���� Ư����";
		
		studentLee.showStudentInfor(); 
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);   
		//����� => chapter5.Student@15db9742 �Ǿ� Ŭ���� �̸�, @�ڿ� 16������ heap�޸𸮿� ������ �ּҰ��̴�
		System.out.println(studentKim);   
		//����� => chapter5.Student@6d06d69c �Ǿ� Ŭ���� �̸�, @�ڿ� 16������ heap�޸𸮿� ������ �ּҰ��̴�
	}

}
