package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1);  //num1 = num1 + 1 
		//위에 코드에서 num1=11 로 바뀜
		System.out.println(num1 %= 10);  // num1 = num1 (11) % 10 (%나머지값) 따라서 1이 출력 된다
		
		num1 -= 1;  //num1 = num1 - 1
		System.out.println(num1);  //   위에위에 코드에서 num1=1이므로 1-1을 하면 0이 나온다
		
		//삼항연산자
		int num = (5<3)? 10:20;  //앞에 항이 true면 10 false면 20
		System.out.println(num);
		
		
		int a = 15;
		int b = 8;
		
		System.out.println(a << 3);  // 2^3 을 a랑 곱해라
		System.out.println(b >> 2);  // 2^2 을 b랑 나눠라
		

	}

}
