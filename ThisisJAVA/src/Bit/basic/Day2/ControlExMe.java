package Bit.basic.Day2;

import java.util.Calendar;


public class ControlExMe {
	static String[] strDDi = {"원숭이" ,"닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
	static String[] strWeek = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

	// 년수 입력하면 나이get
	public int getAge(int year) {
		return (Calendar.getInstance().get(Calendar.YEAR) - year) + 1;
	}

	// 년수 입력하면 띠get
	public String getDddi(int year) {
		int index = year % 12;
		return strDDi[index];
	}

	// 윤달 체크하기
	public boolean yunDal(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	// 년 월일 입력하면 이때까지 총 일자
	public int getCount(int year, int month, int day) {
		int total = (year - 1) * 365;
		// 직전 달까지니까
		for (int i = 1; i < year; i++) {
			if (yunDal(i))
				total++;
		}

		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				total += 31;
				break;
			case 2:
				// 2월인데 윤달이면 29 아니면 28
				if (yunDal(year))
					total += 29;
				else
					total += 28;
				break;
			default:
				total += 30;
			}
		}
		return total;
	}

	//요일 get하기
	public String getWeek(int year, int month, int day) {
		return strWeek[getCount(year,month,day) % 7];
	}
	// 몇년 몇월 몇일 인지 넣기
	public void inputValue(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDddi(year);
		String week = getWeek(year, month, day);
		outputValue(age, ddi, week);
	}

	// 몇년 몇월 몇일 을 넣어주면 나이, 띠, 요일 출력
	public void outputValue(int age, String ddi, String week) {
		System.out.println("Age: " + age + " Dddi: " + ddi + " week: " + week);
	}

	public static void main(String[] args) {
		ControlExMe c = new ControlExMe();
		c.inputValue(2022, 3, 21);
	}
}