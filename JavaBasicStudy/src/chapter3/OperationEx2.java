package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		//���� ���� ������
		int num = 10;
		System.out.println(++num);  //�� �ڵ尡 ������ ���� 1�� ���ض�  >> ����� 11
	//==========================================================	
	//	System.out.println(num++);  //�� �ڵ尡 ������ ���� ���� �ڵ� ���� 1�� ���ض� >> ����� 10
	//	System.out.println(num);    //����� 11
		//���� ���� ������
		//val = ++num;  ==> num ���� 1������ �� val ������ ����
		//val = num++;  ==> num ���� ���� ������ �� num �� 1 ����

	
		//���� ������
		System.out.println(3>5);  //����� false
		System.out.println(3<5);  //����� true
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1 > num2);   //boolean�� true false ���
		System.out.println(flag);
		
				

	}

}
