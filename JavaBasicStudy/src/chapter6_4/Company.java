package chapter6_4;

public class Company {
	
	private static Company instance  = new Company(); // �� �Ѱ� ���� ���ο��� ���
	
	private Company() {  //private ������ �ϸ� �ܺ� ȣ�� �Ұ�
	
	}
	public static Company getInstance() {  // static���� �����ϸ� ��ü �������� �ʰ� class �̸����� ���� ����������
		if(instance == null)
			instance = new Company();
		return instance;
	}

}
