package chap11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스가 존재 합니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("클래스가 존재 합니다");
		} catch (ClassNotFoundException e) {
			System.out.println("java.lang.String2 클래스는 없습니다.");
			e.printStackTrace();
		}
		
		System.out.println("class종료");
	}

}
