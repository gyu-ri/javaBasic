package chapter5;

public class Student {
	int studentID;             //�Ӽ� : �й� , �ڷ��� : int, ���� �̸� : studentId
	int grade;                 //�Ӽ� : �г�, �ڷ��� : int, ���� �̸� : grade
	String studentName;        //�Ӽ� : �̸�, �ڷ��� : String, ���� �̸� : studentName
	String address;            //�Ӽ� : ��� ��, �ڷ��� : String, ���� �̸� : address
	//Stirng ���ڿ��� �����س��� class (java,JDK���� �����ϴ�)
	// public class�� �� �ϳ� 
	
//	public Student() {   //�⺻ ������ default Constructor ���� �ʾƵ� �ڹ� �����Ϸ��� �ڵ����� �־��ش�
//		                 // �����ڰ� �ϳ��� ������ �ڵ����� ������ �ʴ´� 
	                     //������ �뵵 ó�� �� ��ü�� �����ϸ鼭 �ؾ��� �ϵ�, �ϰ� ���� �ϵ��� �����Ҷ� 
//	}
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
	}
	
//	public static void main(String[] args) {
//		Student studentLee = new Student();
//		studentLee.studentName = "�̼���";
//		studentLee.address = "��⵵ ȭ���� �ݼ۵�";
//		
//		studentLee.showStudentInfor(); 
//	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "��⵵ ȭ���� �ݼ۵�";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "���� Ư����";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		//�ν��Ͻ� ������ ����
		//�ν��Ͻ��� ��(Heap) �޸𸮿� ������
		//������ �ν��Ͻ��� �ٸ� �޸𸮿� �ٸ� ���� ����
		
	}  //�� �� �ȿ� ����� ������ ���� ������� �Ѵ� ex)studentLee, studentKim
 
}
