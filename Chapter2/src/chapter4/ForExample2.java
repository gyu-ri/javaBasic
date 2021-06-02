package chapter4;

public class ForExample2 {

	public static void main(String[] args) {
		//이중 for문 (구구단 출력)
		for(int i=2; i<10; i++ ) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.print("\n");
		}

	}

}
