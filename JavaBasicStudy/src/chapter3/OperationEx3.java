package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value =  ((num1 = num1 + 10) < 10) && ((i = i+2) > 10);  //���� false���� �ڿ� ���� ���� ���� ����
	//	boolean value =  ((num1 = num1 + 10) < 10) || ((i = i+2) > 10); 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);  //�տ� ���� false���� �ڿ� ���� �������� �ʾƼ� i���� 2�� ������ ����
		//&& >> �տ� ���� false�̸� �ڿ� ���� �������� ���� �Ѵ� true������ true�� ���´�
		//|| >> �Ѵ� false���� false�� ���´� �ϳ��� true�� true �׷���
	}

}
