package chapter4;

public class WhileExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num <=10) {
			 sum += num;
			 System.out.println("�̰� sum �� "+sum);
			 num++;
			 System.out.println("��� num �� "+num);
			 
	}
//		do {                    //���� ����� while���̶� ��� ���� ���� do�� ���๮�� �����ְ�
//			sum += num;         // while�� ���� üũ�� ���ش�
//			num++;
//		}while(num <= 10);
			
		System.out.println("1���� 10������ ���� "+sum+"�Դϴ�.");

	}

}
