package Bit.basic.Day4.obj1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ObjectEx3 {
	//이름, 나이, 오늘생일, 성별, 지역, 띠, 나이평균, 나이별 정렬, 성씨별 인원수
	
	StringTokenizer st;
	String[] member = {"공지현#961210-1010678#051)234-8910",
						"김가영#990119-2010678#02)934-8910",
						"김민준#580219-1010978#031)734-8910",
						"김병훈#880323-1910678#02)634-8910",
						"박규민#960210-1010678#051)234-8910"};
	//member.length = 5
	//이름 객체
	String[] name = new String[member.length];
	
	//주민번호 객체
	String[] ssn = new String[member.length];
	
	//전화번호 객체
	String[] pn = new String[member.length];

	//한개씩 쪼개서 name 객체에 넣기
	public void tc(String[] m) {
		ObjectEx3 o = new ObjectEx3();
		for(int i= 0 ; i<member.length;i++) {
			st = new StringTokenizer(o.member[i], "#");
			System.out.println(st);
			name[i] = st.nextToken();
			ssn[i]=st.nextToken();
			pn[i]=st.nextToken();
		}
	}
	
	//이름 
	public void name(String[] m) {
		
	}
	//나이
	
	//오늘 생일인지
	
	//성별
	
	//지역
	
	//띠
	
	//나이평균
	
	//나이별 정렬
	
	//성씨별 인원수
	public static void main(String[] args) {
			ObjectEx3 o = new ObjectEx3();
			for(String i : o.name) {
				System.out.println(i);
			}
	}
}


/*
 * //2차원 배열 //한줄 읽고 -> #을 기준으로 배열에 넣어라 // #을 기준으로 3개 쪼개기 // [5][3] -> String
 * String[][] arr = new String[5][3];
 * 
 * //쪼개서 배열에 넣기 public void tc(String[] m){ for(int i=0; i<member.length;i++) {
 * String tmp = member[i]; arr[i] = tmp.split("#"); } }
 */