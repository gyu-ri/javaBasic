package chapter4.exercise;

public class Q2 {

	public static void main(String[] args) {
		//�������� ¦���� ����ϱ� (continue�� ����Ұ�)
		
		for(int i = 2; i < 10; i++) {
			if(i%2==0) {
				System.out.println(i+"�ܽ���");
			}
			for(int j = 1; j < 10; j++) {
				if(i%2 == 0) {
					System.out.println(i+"x"+j+"="+i*j);
					continue;
				}
			}
			System.out.print("\n");
		}

	}

}
