package chap04.sec04;

import java.util.Scanner;

public class MultiplicationTableExampleScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇단부터 출력하나요?");
		for (int m = scanner.nextInt(); m < 10; m++) {
			System.out.println("-----" + m + "-----");
			for (int n = 1; n < 10; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
	}
}
