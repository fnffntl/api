package sample03_string;

import java.util.StringTokenizer;

public class StringTokenizerApp2 {
	
	public static void main(String[] args) {
		
		// String의 split메소드와 StringTokenizer의 차이점
		
		String text1 = "김유신,영업2팀,과장,010-1111-1111";
		String text2 = "강감찬,,인턴,010-2222-2222";
		
		// split 메소드
		System.out.println("### split메소드로 문자열 자르기");
		String[] value1 = text1.split(",");
		String[] value2 = text2.split(",");
		System.out.println("첫번째 문자열의 텍스트갯수 -> " + value1.length);	// 4
		System.out.println("두번째 문자열의 텍스트갯수 -> " + value2.length);	// 4
		
		// StringTokenizer
		System.out.println("### StringTokenzier로 문자열 토큰화하기");
		StringTokenizer tokenizer1 = new StringTokenizer(text1, ",");
		StringTokenizer tokenizer2 = new StringTokenizer(text2, ",");
		System.out.println("첫번째 문자열의 토큰갯수 -> " + tokenizer1.countTokens()); // 4
		System.out.println("두번째 문자열의 토큰갯수 -> " + tokenizer2.countTokens()); // 3
		
		/*
		 * StringTokenizer는 구분기호로 나누어진 토큰이 빈 문자일 경우 해당 토큰을 무시한다.
		 *  String text1 = "김유신,영업2팀,과장,010-1111-1111";
		 *  String text2 = "강감찬,,인턴,010-2222-2222";
		 *  
		 *  text1을 토큰화하면 "김유신", "영업2팀", "과장", "010-1111-1111"로 토큰화된다.
		 *  text2를 토큰화하면 "강감찬", "인턴", "010-2222-2222"로 토큰화한다.
		 */
	}
}






















