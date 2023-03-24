package chap04.sec03;

import java.util.Scanner;

public class SwitchValueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		String grade = scanner.nextLine();
	
		//JAVA 11이전
		int score =0;
		switch(grade) {
		case "A":
			score = 100;
			break;
		case "B":
			int result = 100 - 20;
			score = result;
			break;
		default:
			score = 50;
		}
		System.out.println(score);
//		//JAVA 12 부터
//		int score2 = switch(grade) {
//		case "A" -> 100;
//		case "B" -> {
//			//여기 연산식
//			int result = 100 - 20;
//			yield result;
//		}
//		default -> 50;
//		};
		
//		System.out.println(score2);
	}

}
