package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;  // ������ ����ȯ  -> ���� �����Ϳ��� ū�����ʹ� ������ ����ȯ
		
		System.out.println(fNum);
		
		double dNum = fNum + num;  // num=> float�� ������ ����ȯ �ǰ�  ���� ���� �ٽ� double�� ������ ����ȯ�� �Ǿ� ������ �ȴ�.
		System.out.println(dNum);
		
		

	}

}
