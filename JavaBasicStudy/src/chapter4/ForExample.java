package chapter4;

public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <=10; sum+=num, num++) {  //for( ; ; ) �̰Ŵ�  while(true)�� ������ ���� ����~
			
//			sum += num;
//			num++;
		}
		System.out.println(sum);
		System.out.println(num);

	}

}
