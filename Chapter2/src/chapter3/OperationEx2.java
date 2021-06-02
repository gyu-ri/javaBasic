package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		//증감 감소 연산자
		int num = 10;
		System.out.println(++num);  //이 코드가 끝나기 전에 1을 더해라  >> 결과값 11
	//==========================================================	
	//	System.out.println(num++);  //이 코드가 끝나고 나서 다음 코드 부터 1을 더해라 >> 결과값 10
	//	System.out.println(num);    //결과값 11
		//증가 감소 연산자
		//val = ++num;  ==> num 값이 1증가한 후 val 변수에 대입
		//val = num++;  ==> num 값을 먼저 대입한 후 num 값 1 증가

	
		//관계 연산자
		System.out.println(3>5);  //결과값 false
		System.out.println(3<5);  //결과값 true
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1 > num2);   //boolean은 true false 출력
		System.out.println(flag);
		
				

	}

}
