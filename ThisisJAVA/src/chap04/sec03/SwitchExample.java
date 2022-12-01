package chap04.sec03;

public class SwitchExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 6) + 1;
			switch(num){
				case 1:
					System.out.println("1번 입니다.");
					break;
				case 2:
					System.out.println("2번 입니다.");
					break;
				case 3:
					System.out.println("3번 입니다.");
					break;
				case 4:
					System.out.println("4번 입니다.");
					break;
				case 5:
					System.out.println("5번 입니다.");
					break;
				case 6:
					System.out.println("6번 입니다.");
					break;
					
			}
		}
	}

}
