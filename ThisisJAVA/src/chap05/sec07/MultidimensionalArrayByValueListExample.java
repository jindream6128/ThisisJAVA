package chap05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 scores 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		//배열의 깊이
		System.out.println("1차원 배열의 길이" + scores.length);
		
		System.out.println("2차원 배열의 깊이"+ scores[0].length);
		System.out.println("2차원 배열의 깊이"+ scores[1].length);
		
		int classSum1 = 0;
		for(int i =0; i<scores[0].length;i++) {
			classSum1 += scores[0][i];
		}
		double classavg1 = (double)classSum1 / scores[0].length;
		
		System.out.println("1반 평균" + classavg1);
		
		int totalStudent = 0;
		int totalsum =0;
		for (int i = 0; i<scores.length;i++) {
			totalStudent += scores[i].length;
			for(int k = 0; k<scores[i].length; k++) {
				totalsum += scores[i][k];
			}
		}
		double totalavg = (double) totalsum / totalStudent;
		System.out.println("전체 학생의 평균"+totalavg);
		
	}

}
