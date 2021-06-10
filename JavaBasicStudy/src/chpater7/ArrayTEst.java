package chpater7;

public class ArrayTEst {

	public static void main(String[] args) {

		
		//int[] numbers = new int[10];  //40byte 생성
		int[] numbers = new int[] {0,1,2};
		System.out.println(numbers.length); // 길이 3 나옴
		
		
		int[] numbers2 = new int[3];
		
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		
		for(int i = 0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		
		
		
	}

}
