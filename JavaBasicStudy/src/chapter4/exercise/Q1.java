package chapter4.exercise;

public class Q1 {

	public static void main(String[] args) {
		// if-else if, switch-case문을 사용해서 작성하기
		
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		char operator2;
		
		if (operator == '+') {
			System.out.println(num1+num2);
	//	}else if (operator == '-') {
		}else if(operator =='*'){
			System.out.println(num1*num2);
		}
		
		
		switch(num2) {
		case 1 : operator2 = '/';
			break;
			
		case 2 : operator2 = '+';
			break;

		case 3 : operator2 = '*';
			break;
		
		default: operator2 = '/';
			break;
			
		}
		System.out.println(num1+""+operator2+num2);

	}

}
