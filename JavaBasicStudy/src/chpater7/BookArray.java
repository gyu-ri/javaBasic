package chpater7;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //배열 안에 객체의 내용을 안넣어 줘서 null 뜸
		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i = 0; i<library.length; i++) {   
			System.out.println(library[i]);          //객체의 내용을 넣어 줘서 주소값이 뜸
		}
		
		for(int i = 0; i<library.length; i++) {  
			library[i].showBookInfo();              //객체의 내용 출력
		}
	}

}
