package Bit.basic.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yundal {
	static int[] arr = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//윤년 구분하면서 arr[1]에 넣기
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			arr[1] = 29;
		} else {
			arr[1] = 28;
		}
		
		//check 해서 a b c 가 날짜 범위안에 있는건지 확인하기
		if (check(a, b, c)) {
			int yearTotal = (a - 1) * 365 + ((a - 1) / 4) - ((a - 1) / 100) + ((a - 1) / 400);

			int monTotal = 0;
			for (int num = 0; num < b - 1; num++) {
				monTotal += arr[num];
			}

			int ans = yearTotal + monTotal + c;

			switch (ans % 7) {
			case 1:
				System.out.println("월");
				break;
			case 2:
				System.out.println("화");
				break;
			case 3:
				System.out.println("수");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			case 7:
				System.out.println("일");
				break;
			}

		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		br.close();
	}

	
	static boolean check(int a, int b, int c) {
		//년도랑 월이랑 조건범위 안에 있어야함
		if ((1 <= a) && (1 <= b) && (b < 13)) {
			//2월달이 해당 범위에있어야함
			if (c <= arr[b - 1]) {
				return true;
			}
			return false;
		}
		return false;
	}
}
