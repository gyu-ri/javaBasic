package chapter5;

public class Student {
	int studentID;             //속성 : 학번 , 자료형 : int, 변수 이름 : studentId
	int grade;                 //속성 : 학년, 자료형 : int, 변수 이름 : grade
	String studentName;        //속성 : 이름, 자료형 : String, 변수 이름 : studentName
	String address;            //속성 : 사는 곳, 자료형 : String, 변수 이름 : address
	//Stirng 문자열을 구현해놓은 class (java,JDK에서 제공하는)
	// public class는 단 하나 
	
//	public Student() {   //기본 생성자 default Constructor 적지 않아도 자바 컴파일러가 자동으로 넣어준다
//		                 // 생성자가 하나라도 있으면 자동으로 생기지 않는다 
	                     //생성자 용도 처음 이 객체를 생성하면서 해야할 일들, 하고 싶은 일들을 구현할때 
//	}
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
	}
	
//	public static void main(String[] args) {
//		Student studentLee = new Student();
//		studentLee.studentName = "이순신";
//		studentLee.address = "경기도 화성시 반송동";
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
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "경기도 화성시 반송동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울 특별시";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		//인스턴스 여러개 생성
		//인스턴스는 힙(Heap) 메모리에 생성됨
		//각각의 인스턴스는 다른 메모리에 다른 값을 가짐
		
	}  //이 블럭 안에 선언된 변수를 지역 변수라고 한다 ex)studentLee, studentKim
 
}
