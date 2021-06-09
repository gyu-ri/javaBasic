package chapter6_4;

import java.util.Calendar;

public class CompanyTest {
	
	public static void main(String[] arga) {
		
		Company c1 = Company.getInstance();
	
		Company c2 = Company.getInstance();
		
		System.out.println(c1);   //c1 ,c2 주소값 같다
		System.out.println(c2);
	}

}
