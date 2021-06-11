package chpater7;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //배열 안에 객체의 내용을 안넣어 줘서 null 뜸
		}
		
		library[0] = new Book("가나다", "홍길동");
		library[1] = new Book("라마바", "김유신");
		library[2] = new Book("사아자", "강감찬");
		library[3] = new Book("차카타파하", "이성계");
		library[4] = new Book("훈민정음", "세종대왕");
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //객체의 내용을 넣어 줘서 주소값이 뜸
		}
		
		for(int i = 0; i<library.length; i++) {  
			library[i].showBookInfo();              //객체의 내용 출력
		}
	}

}
