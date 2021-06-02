package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;  // 묵시적 형변환  -> 작은 데이터에서 큰데이터는 묵시적 형변환
		
		System.out.println(fNum);
		
		double dNum = fNum + num;  // num=> float로 묵시적 형변환 되고  더한 값이 다시 double로 묵시적 형변환이 되어 연산이 된다.
		System.out.println(dNum);
		
		

	}

}
