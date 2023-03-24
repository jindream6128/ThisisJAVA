package Bit.basic.Day5;

public class ObjectEx2Main {

	public static void main(String[] args) {
		ObjectEx2.getInstance().setMessage("Java");
		System.out.println(ObjectEx2.getInstance().getMessage());
		//getInstance -> 를 해주면 새로운 객체를 만든다.
	}
}
