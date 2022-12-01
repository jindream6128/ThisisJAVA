package chap02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //변수 선언
		/*타입 -> 처음에는 에러발생(기본타입이 아니므로) ->
		 따라서 Scanner를 import해준다
		 -> 현재 컴퓨터의 입력장치(키보드)로부터 데이터를 읽어와라
		*/
//		System.out.print("x값 입력: ");
//		String strx = scanner.nextLine();
//		int x = Integer.parseInt(strx);
//		//숫자가 아닌게 입력되면 에러가뜸
//		System.out.println(strx);
//		
//		System.out.print("y값 입력: ");
//		String stry = scanner.nextLine();
//		int y = Integer.parseInt(stry);
//		
//		int result = x + y;
//		System.out.println("x + y: "+ result);
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: "+data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
