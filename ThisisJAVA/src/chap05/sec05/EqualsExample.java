package chap05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
	
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 strVar2 같은 객체 참조");
		}else {
			System.out.println("strVar1 strVar2 다른 객체 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 strVar2 문자열 동일");
		}
		
		if(strVar1 == strVar3) {
			System.out.println("strVar1 strVar3 같은 객체 참조");
		}else {
			System.out.println("strVar1 strVar3 다른 객체 참조");
		}
		if(strVar1.equals(strVar3)) {
			System.out.println("strVar1 strVar3 문자열 동일");
		}
	}

}
