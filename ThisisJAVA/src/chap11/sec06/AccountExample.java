package chap11.sec06;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("예금액을 입력해 주세요");
		int num = sc.nextInt();
		
		ac.deposit(num);
		
		System.out.println("예금액: " + ac.getBalance());
		
		System.out.println("출금액을 입력해 주세요");
		int num2 = sc.nextInt();
		//출금
		try {
			ac.withdraw(num2);
			System.out.println("남은 금액: " + ac.getBalance());
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
