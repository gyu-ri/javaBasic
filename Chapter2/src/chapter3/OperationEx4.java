package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1);  //num1 = num1 + 1 
		//���� �ڵ忡�� num1=11 �� �ٲ�
		System.out.println(num1 %= 10);  // num1 = num1 (11) % 10 (%��������) ���� 1�� ��� �ȴ�
		
		num1 -= 1;  //num1 = num1 - 1
		System.out.println(num1);  //   �������� �ڵ忡�� num1=1�̹Ƿ� 1-1�� �ϸ� 0�� ���´�
		
		//���׿�����
		int num = (5<3)? 10:20;  //�տ� ���� true�� 10 false�� 20
		System.out.println(num);
		
		
		int a = 15;
		int b = 8;
		
		System.out.println(a << 3);  // 2^3 �� a�� ���ض�
		System.out.println(b >> 2);  // 2^2 �� b�� ������
		

	}

}
