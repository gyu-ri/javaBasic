package chapter4.exercise;

public class Q3 {

	public static void main(String[] args) {
		//�������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ���α׷��� ����� ������ (break���� �̿��� ����)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i < j)
				break;
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
