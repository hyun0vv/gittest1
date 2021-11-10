package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {

	public static void main(String[] args) {
		
		// Calendar란 날짜 인스턴스 입니다
		// 달력이나 시간계산등을 사용할때 많이 사용하는 객체
		
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTimeInMillis());
		
		// 보기불편하기 때문에 형식을 만들어서 사용할수있다.
		// 날짜로 변환방법 지정
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		// 현재 시간을 내가 정한 format 형식으로 변환
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
		
		
		
		
		
	}

}
