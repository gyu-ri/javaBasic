package chpater7;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //�迭 �ȿ� ��ü�� ������ �ȳ־� �༭ null ��
		}
		
		library[0] = new Book("������", "ȫ�浿");
		library[1] = new Book("�󸶹�", "������");
		library[2] = new Book("�����", "������");
		library[3] = new Book("��īŸ����", "�̼���");
		library[4] = new Book("�ƹ�����", "�������");
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //��ü�� ������ �־� �༭ �ּҰ��� ��
		}
		
		for(int i = 0; i<library.length; i++) {  
			library[i].showBookInfo();              //��ü�� ���� ���
		}
	}

}
