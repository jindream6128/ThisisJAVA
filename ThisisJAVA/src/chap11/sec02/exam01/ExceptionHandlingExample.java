package chap11.sec02.exam01;

public class ExceptionHandlingExample {

	
	public static void printlength(String data) {
		try {
		int result = data.length();
		System.out.println("문자 :" + result);
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally {
		System.out.println("마무리 실행 \n");
	}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		printlength("Thisisjava");
		printlength(null);
		
		System.out.println("프로그램 종료");
	}

}
