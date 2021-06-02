package chapter4;

public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <=10; sum+=num, num++) {  //for( ; ; ) 이거는  while(true)랑 같은거 무한 루프~
			
//			sum += num;
//			num++;
		}
		System.out.println(sum);
		System.out.println(num);

	}

}
