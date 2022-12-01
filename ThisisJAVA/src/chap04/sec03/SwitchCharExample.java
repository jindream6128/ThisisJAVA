package chap04.sec03;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자 입력");
		String grade = scanner.nextLine();

		switch (grade) {
		case "A": // string 비교는 큰따옴표("")
		case "a":
			System.out.println("우수 회원 입니다.");
			break;
		case "B":
		case "b":
			System.out.println("일반 회원 입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
		}

		// JAVA12
		switch (grade) {
		case "A", "a" -> {
			System.out.println("우수 회원 입니다.");
		}
		case "B", "b" -> {
			System.out.println("일반 회원 입니다.");
		}
		default -> {
			System.out.println("손님 입니다.");
		}
		}
		
		//한줄일때는 중괄호 생략 가능
		switch(grade) {
		case "A", "a" -> System.out.println("우수 회원 입니다.");
		case "B", "b" -> System.out.println("일반 회원 입니다.");
		default -> System.out.println("손님 입니다.");
		}
		
		
		}
	}


