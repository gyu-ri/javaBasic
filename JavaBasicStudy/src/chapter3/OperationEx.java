package chapter3;

public class OperationEx {

	public static void main(String[] args) {
		//대입 연산자
		//변수에 값을 대입 하는 연산자
		//연산의 결과를 변수에 대입
		//우선 순위가 가장 낮은 연산자
		//왼쪽 변수(lvalue)에 오른쪽 변수(값)(rvalue)를 대입
		int age = 24;
		System.out.println(age);
		
		int num = 10;
		int num2 = -num;
		System.out.println(num);    // 결과 10
		System.out.println(num2);   //결과 -10
		
		num = -num;
		System.out.println(num);    // 결과 -10
		//변수의 값을 바꾸려면 대입 연산자를 사용하여 바꿔야 한다
		
		
		
	}

}
