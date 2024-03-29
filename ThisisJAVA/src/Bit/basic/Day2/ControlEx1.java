package Bit.basic.Day2;

import java.util.Calendar;


public class ControlEx1 {
	String[] strDDi = { "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이" };
	String[] strWeek = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

	//나이 받기
	public int getAge(int year) {
		return (Calendar.getInstance().get(Calendar.YEAR) - year) + 1;
	}

	//띠 받아오기
	public String getDddi(int year) {
		int index = year % 12;
		return strDDi[index != 0 ? (index - 1) : strDDi.length - 1];
	}

	public boolean yunDal(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int getCount(int year, int month, int day) {

		int cnt = (year - 1) * 365;

		for (int i = 1; i < year; i++) {
			if (yunDal(i))
				cnt++;
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
				cnt += 31;
				break;
			case 2:
				if (yunDal(year))
					cnt += 29;
				else
					cnt += 28;
				break;
			default:
				cnt += 30;
			}
		} // for
		cnt += day;
		return cnt;
	}

	public String getWeek(int year, int month, int day) {
		return strWeek[getCount(year, month, day) % 7];
	}

	public void inputValue(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDddi(year);
		String week = getWeek(year, month, day);
		outputValue(age, ddi, week);
	}

	public void outputValue(int age, String ddi, String week) {
		System.out.println("Age=" + age + " Ddi=" + ddi + " Week=" + week);
	}

	public static void main(String[] args) {
		ControlEx1 c = new ControlEx1();
		c.inputValue(2023, 3, 21);
	}

}