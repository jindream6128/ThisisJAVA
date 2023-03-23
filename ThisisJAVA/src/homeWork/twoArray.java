package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class twoArray {
	
	//일단 2 5 지정하기
	int[][] arr = new int[2][5];
	
	
	//isFull -> 전부다 찾는지 확인하기
	public boolean isFull() {
		
		return false;
	}

	
	//isEmpty -> 비어있는지 확인 -> 비면 해당 인덱스 -> 안비면 -1
	//-> 2개의 값을 리턴해야한다? 
	public int[] isEmpty() {
		int[] tmp = new int[2];
		
		return tmp;
	}
	
	//increment -> 꽉찾을때 2 5 -> 3 5 로 늘려주기
	public void increment() {
		
	}
	
	//search ->해당 값의 인덱스 반환
	//해당 값을 찾았을때 그냥 sb에 넣기
	public void search(int n) {
		
	}
	
	//modify -> 해당값을 넣으면 해당 자리에 수정할값 넣기 void
	public void modify(int a , int b) {
		
	}
	
	//특정 값 n 삭제 -> 해당 값을 찾아서 해당 자리에 0으로 바꾸기 
	public void delete(int n) {
		
	}
	
	//add 일단 한개만 추가할때
	public void add(int n) {
		
	}
	
	//add 매개변수 2개 들어갈때
	/*
	 * public void add() {
	 * 
	 * }
	 */
	
	//main메서드 -> 입력받고 -> switch 돌려서 진행하기
	public static void main(String[] args) {
		twoArray t = new twoArray();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1: add 2: search 3: modify 4: delete 5: print 6: exit");

			int tc = sc. nextInt();
			
			switch(tc) {
			
			case 1:
				System.out.println("1 이상의 add할 값 1개 입력해 주세요");
				int tc1 = sc.nextInt();
				t.add(tc1);
				break;
				
			case 2:
				System.out.println("search 할 값을 입력해 주세요");
				int tc2 = sc. nextInt();
				//넣고 출력하기
				
			case 3:
				System.out.println("원본값 a와 수정할 값 b를 입력해 주세요");
				int tc3 = sc.nextInt();
				int tc4 = sc.nextInt();
				t.modify(tc3, tc4);
				break;
			
			case 4: 
				System.out.println("삭제할 값을 입력해 주세요");
				int tc5 = sc.nextInt();
				
			case 5:
				System.out.println(Arrays.deepToString(t.arr));
				break;
			
			case 6:
				System.exit(0);
			}
		}
		
		
		
	}
	
}
