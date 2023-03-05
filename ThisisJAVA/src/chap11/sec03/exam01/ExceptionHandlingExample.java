package chap11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		String[] arr = { "100", "1oo" };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
				int value = Integer.parseInt(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 초과됨" + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가" + e.getMessage());
		}

	}
}
