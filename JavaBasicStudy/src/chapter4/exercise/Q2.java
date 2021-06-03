package chapter4.exercise;

public class Q2 {

	public static void main(String[] args) {
		//구구단을 짝수만 출력하기 (continue문 사용할것)
		
		for(int i = 2; i < 10; i++) {
			if(i%2==0) {
				System.out.println(i+"단시작");
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
