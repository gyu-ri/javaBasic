package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value =  ((num1 = num1 + 10) < 10) && ((i = i+2) > 10);  //앞이 false여서 뒤에 항은 연산 하지 않음
	//	boolean value =  ((num1 = num1 + 10) < 10) || ((i = i+2) > 10); 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);  //앞에 항이 false여서 뒤에 항은 연산하지 않아서 i값은 2로 변하지 않음
		//&& >> 앞에 항이 false이면 뒤에 항을 연산하지 않음 둘다 true여야지 true가 나온다
		//|| >> 둘다 false여야 false가 나온다 하나라도 true면 true 그래서
	}

}
