package chapter2;

public class VariableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수는 4바이트로 저장이 된다
		
		// int num = 12345678900;  int가 저장할 수 있는 범위 넘음
		// long num = 12345678900; 숫자가 기본적으로 4바이트로 저장되어서 이렇게 쓸 수 없음
		 long num = 12345678900L;   //맨뒤에 L을 쓰면 8바이트 저장할거다  long형임을 표기 해줘야함
		 
	    // 인코딩 - 각 문자에 따른 특정한 숫자 값(코드 값)을 부여
		// 디코딩 - 숫자 값을 원래의 문자로 변환
		// ex) A -> 65 인코딩, 65 -> A 디코딩

	}

}
