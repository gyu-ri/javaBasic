package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		
		//MSB (Most Significant Bit) 가장 중요한 비트 => 2진수에서 맨앞에 비트를 가르킨다
		//맨앞자리 0 이면 앙수(+), 맨앞자리 1 이면 음수(-)
		//2진법에서 음수는 보수를 사용하여 만든다
		//ex) 00000101-10000101=10001010 ==> 0이 아니다
		//    따라서 2진법에서 음수를 만들기 위해 2의 보수를 이용하여
		//    00000101-11111011=100000000을 만든다 맨앞자리는 트런케이트 되어 날아간다
		//     ==> 8비트인데 자릿수가 넘어가서 앞자리 날아감~~
		
		int sum = num1 + num2;
		int sum1 = num1 - num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		System.out.println(sum1);

	}

}
