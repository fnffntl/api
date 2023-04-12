package sample05_date;

import java.util.Date;

public class DateApp1 {
	public static void main(String[] args) {
		
		/*
		 * 날짜와 시간의 표현
		 * 	- java.util.Date
		 * 		클래스는 날짜와 시간정보를 표현하는 클래스이다.
		 * 	- java.sql.Date
		 * 		클래스는 날짜를 표현하는 클래스이다.
		 * 	- java.sql.Time
		 * 		클래스는 시간을 표현하는 클래스이다.
		 * 	- java.sql.TimeStamp
		 * 		Time클래스보다 더 정밀한 시간을 표현하는 클래스이다.
		 * 	- java.time.LocalDate
		 * 		날짜정보를 표현하는 클래스이다.
		 * 	- java.time.LocalTime
		 * 		시간정보를 표현하는 클래스이다.
		 * 	- java.time.LocalDateTime
		 * 		날짜와 시간정보를 표현하는 클래스이다.
		 * 
		 * 	* java.util.Date는 시스템의 현재 날짜와 시간정보를 제공한다.
		 * 
		 * 	* java.sql는 데이터베이스의 날짜와 시간정보를 표현하기 위한 클래스를 제공한다.
		 *  
		 * 	* java.time 패키지의 날짜와 시간정보 클래스는 java8부터 추가되었다.
		 * 	* java.time 패키지에는 날짜와 관련된 다양한 연산을 지원하는 기능이 추가되었다.
		 */
		
		// 시스템의 현재 날짜와 시간정보를 가진 Date객체를 생성하기
		Date now = new Date();
		System.out.println(now);
		
		
		// 유닉스타임을 전달받아서 해당 날짜와 시간정보를 표현하는 Date객체를 생성하기
		Date someDate = new Date(0);
		System.out.println(someDate);
		
	}
}

















