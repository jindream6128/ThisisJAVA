package chap09.sec04.exam03;

public class A {
	public void method1(int arg) {
		int var = 1;

		class B {

			//컴파일 오류 왜냐고? arg를 바꿀수 없는데 밖에서 바꾸기 때문에
//			void method2() {
//				System.out.println("arg = " + arg);
//				System.out.println("var = " + var);
//			}
			
		}
		arg = 2;
		var = 2;
			
		System.out.println("arg = " + arg);
		System.out.println("var = " + var);
	}

	public static void main(String[] args) {
		A a = new A();
		a.method1(3);
	}
}
