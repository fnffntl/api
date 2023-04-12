package sample05_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp1 {
	public static void main(String[] args) {
		/*
		 * java.text.SimpleDateTimeFormat
		 * 	- Date객체의 날짜와 시간정보를 지정한 형식의 문자열로 변환한다.
		 * 	- 날짜형식의 문자열을 해석해서 Date객체로 변환한다.
		 * 	
		 * 주요 API
		 * 		생성자
		 * 			SimpleDateFormat(String pattern)
		 * 				지정된 패턴으로 초기화된 SimpleDateFormat객체를 생성한다.
		 * 		메소드
		 * 			String format(Date date)
		 * 				Date객체의 날짜와 시간정보를 지정된 패턴의 문자열로 변환한다. 
		 * 			Date parse(String text)
		 * 				지정된 날짜형식으로 작성된 문자열을 Date객체로 변환한다. 
		 * 
		 * 주요 패턴 문자
		 * 		y	년도(year)
		 * 		M	월(month)
		 * 		w	주(week of year)
		 * 		W	주(week of month)
		 * 		d	일(day of month: 1 ~ 31)
		 * 		D	일(day of year: 1 ~ 365)
		 * 		E	요일
		 * 		a	오전 혹은 오후
		 * 		H	시간(0 ~ 23)
		 * 		h	시간(1 ~ 12)
		 * 		m	분
		 * 		s	초
		 * 		S	밀리초
		 */
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date객체 생성하기
		Date now = new Date();
		System.out.println("포맷팅 하기 전 -> " + now);
		
		// 날짜와 시간 패턴 지정하기
//		String pattern = "yyyy-MM-dd";
//		String pattern = "yyyy년 M월 d일";
//		String pattern = "yyyy년 M월 d일 EEEE";
//		String pattern = "HH:mm:ss";
//		String pattern = "a h시 m분 s초";
//		String pattern = "yyyy-MM-dd HH:mm:ss";
		String pattern = "yy년 M월 d일 EEEE a h시 m분 s초";
		
		// 패턴정보를 전달받아서 SimpleDateFormat객체를 생성하고 초기화하기
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// Date객체(날짜와 시간정보)를 지정된 패턴형식의 문자열로 변환하기
		String text = sdf.format(now);
		System.out.println("포맷팅된 날짜와 시간정보 -> " +text);
		
		
	}
}














