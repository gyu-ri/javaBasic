package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		
		//MSB (Most Significant Bit) ���� �߿��� ��Ʈ => 2�������� �Ǿտ� ��Ʈ�� ����Ų��
		//�Ǿ��ڸ� 0 �̸� �Ӽ�(+), �Ǿ��ڸ� 1 �̸� ����(-)
		//2�������� ������ ������ ����Ͽ� �����
		//ex) 00000101-10000101=10001010 ==> 0�� �ƴϴ�
		//    ���� 2�������� ������ ����� ���� 2�� ������ �̿��Ͽ�
		//    00000101-11111011=100000000�� ����� �Ǿ��ڸ��� Ʈ������Ʈ �Ǿ� ���ư���
		//     ==> 8��Ʈ�ε� �ڸ����� �Ѿ�� ���ڸ� ���ư�~~
		
		int sum = num1 + num2;
		int sum1 = num1 - num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		System.out.println(sum1);

	}

}
