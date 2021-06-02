package chapter4;

public class WhileExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num <=10) {
			 sum += num;
			 System.out.println("이건 sum 값 "+sum);
			 num++;
			 System.out.println("요건 num 값 "+num);
			 
	}
//		do {                    //위에 사용한 while문이랑 결과 값은 동일 do에 수행문을 적어주고
//			sum += num;         // while에 조건 체크를 해준다
//			num++;
//		}while(num <= 10);
			
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");

	}

}
