package chap12.sec03.exam02;

public class ToStringExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		System.out.println(myPhone);
		
		System.out.println(myPhone.toString());
	}

}
