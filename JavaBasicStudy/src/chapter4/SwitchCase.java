package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		//����ġ��
		switch(rank) {
			case 1:medalColor = 'G';
				  // break;    //�̰� �Ⱦ��� break ���������� ������ �ϱ� ������ break�� ��� �Ѵ�
			                   //���� 1�������� ������ S�� ���´�
			case 2 : medalColor = 'S';
					break;     //break�� ���������� �������ϰ� switch���� ������
			case 3 : medalColor = 'B';
			        break;
			default : medalColor = 'A';
		}
		System.out.println(rank+"�� �޴��� ������ "+medalColor +"�Դϴ�.");
	}

}
