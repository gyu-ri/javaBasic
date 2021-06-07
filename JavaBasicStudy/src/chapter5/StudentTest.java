package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "경기도 화성시 반송동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울 특별시";
		
		studentLee.showStudentInfor(); 
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);   
		//결과값 => chapter5.Student@15db9742 맨앞 클래스 이름, @뒤에 16진수로 heap메모리에 생성된 주소값이다
		System.out.println(studentKim);   
		//결과값 => chapter5.Student@6d06d69c 맨앞 클래스 이름, @뒤에 16진수로 heap메모리에 생성된 주소값이다
	}

}
