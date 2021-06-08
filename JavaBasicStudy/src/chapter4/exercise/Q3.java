package chapter4.exercise;

public class Q3 {

	public static void main(String[] args) {
		//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요 (break문을 이용해 보자)
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i < j)
				break;
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
