package pk06;

import java.util.Calendar;

import pk06.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today=null;
		
		Calendar cal=Calendar.getInstance();//객체
		int week=cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week);
		switch (week) {
		case 7: case 14: case 21: case 28:
			today=Week.MonDay;
			break;
		case 1: case 8: case 15: case 22: case 29:
			today=Week.TuesDay;
			break;
		case 2: case 9: case 16: case 23: case 30:
			today=Week.WednesDay;
			break;
		case 3: case 10: case 17: case 24: case 31:
			today=Week.ThursDay;
			break;
		case 4: case 11: case 18:
			today=Week.FriDay;
			break;
		case 25:
			System.out.println("크리스마스입니다");
			today=Week.FriDay;
			break;
		case 5: case 12: case 19: case 26:
			today=Week.SaturDay;
			break;
		case 6: case 13: case 20: case 27:
			today=Week.SunDay;
			break;
		}
		System.out.println("오늘의 날짜는 12월 "+week+"일 "+today+ "입니다.");
	}

}
