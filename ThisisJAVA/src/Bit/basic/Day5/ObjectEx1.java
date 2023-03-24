package Bit.basic.Day5;

public class ObjectEx1 {
	//static은 항상 메모리에 먼저 올라오니까 static 블럭으로 생성자를 생성한다.
	private static final int cnt;
	
	static {
		cnt = 90;
	}
		
	public static void main(String args[]) {
		ObjectEx1 o = new ObjectEx1();
		System.out.println(o.cnt);
	}

}
