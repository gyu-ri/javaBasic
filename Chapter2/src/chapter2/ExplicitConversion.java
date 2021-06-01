package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum = 1000;
		byte bNum = (byte)iNum;   // 명시적 형변환
		
		System.out.println(iNum);
		System.out.println(bNum);   //작은거에 큰거가 들어가 데이터 유실 되어 쓰레기 값 나옴
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		
		int num1 = (int)dNum + (int)fNum; // 실수를 정수로 변환하고 더 하여 3+0=3이 되고
		int num2 = (int)(dNum + fNum);   // 실수를 더하고 정수로 변환 하여 3.14+0.9=4.04 이 수를 정수로 변화 하여 뒤에 소수점 삭제 되어 값이 4가 나온다
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
