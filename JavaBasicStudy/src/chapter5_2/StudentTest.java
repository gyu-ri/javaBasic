package chapter5_2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorea("����", 100);
		studentJames.setMath("����", 100);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorea("����", 85);
		studentTomas.setMath("����", 70);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();

	}

}