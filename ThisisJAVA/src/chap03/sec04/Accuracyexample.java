package chap03.sec04;

public class Accuracyexample {

	public static void main(String[] args) {
		int apple =1 ; //사과 1조각을
		double pieceUnit = 0.1; //총 10조각으로 쪼갠다
		int number = 7;
		
		double result1 = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: "+result1);
		//0.2999999999999999
		
		//정수형 연산을 하면
		int totalPieces = apple*10; //10 조각
		int result2 = totalPieces - number;
		System.out.println("사과 10조각에서 남은 양: " + result2);
		// 3
		System.out.println("사과 1개에서 남은 양: " + result2/10.0);
		// 0.3
	}

}
