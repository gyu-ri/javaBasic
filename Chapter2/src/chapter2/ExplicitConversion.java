package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum = 1000;
		byte bNum = (byte)iNum;   // ����� ����ȯ
		
		System.out.println(iNum);
		System.out.println(bNum);   //�����ſ� ū�Ű� �� ������ ���� �Ǿ� ������ �� ����
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		
		int num1 = (int)dNum + (int)fNum; // �Ǽ��� ������ ��ȯ�ϰ� �� �Ͽ� 3+0=3�� �ǰ�
		int num2 = (int)(dNum + fNum);   // �Ǽ��� ���ϰ� ������ ��ȯ �Ͽ� 3.14+0.9=4.04 �� ���� ������ ��ȭ �Ͽ� �ڿ� �Ҽ��� ���� �Ǿ� ���� 4�� ���´�
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
