package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		//스위치문
		switch(rank) {
			case 1:medalColor = 'G';
				  // break;    //이거 안쓰면 break 만날때까지 수행을 하기 때문에 break를 써야 한다
			                   //따라서 1등이지만 색깔은 S로 나온다
			case 2 : medalColor = 'S';
					break;     //break를 만날때까지 수행을하고 switch문을 나간다
			case 3 : medalColor = 'B';
			        break;
			default : medalColor = 'A';
		}
		System.out.println(rank+"등 메달의 색깔은 "+medalColor +"입니다.");
	}

}
