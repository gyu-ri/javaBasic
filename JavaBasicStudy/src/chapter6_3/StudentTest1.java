package chapter6_3;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ= new Student();
		System.out.println(studentJ.serialNum);
		System.out.println(studentJ.studentID);
		
	//	studentJ.serialNum++;

		Student studentT= new Student();
		System.out.println(studentJ.studentID);
		
		System.out.println(studentJ.serialNum);   //두개 결과값 같다  두 인스턴스가 공유 되고 있다
		System.out.println(studentT.serialNum);
	}

}
