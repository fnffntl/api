package sample03_string;

import java.util.StringTokenizer;

public class StringTokenizerApp {
	public static void main(String[] args) {
		
		String text = "지난달 경기도 화상 동탄2신도시의 한 아파트를 5억원에 계약했다.";
				
		// StringTokenizer 객체는 전달받은 문자열을 토근화한다.
		// 구분기호를 지정하지 않으면 공백/탭/개행문자로 문자열을 구분해서 토큰화한다.
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// 토큰화된 문자열 출력하기
		// "아파트"라는 글자가 포함된 단어는 몇번이나 나왔나?
		int cnt = 0;
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
//			System.out.println(token);
			if (token.contains("아파트")) {
				cnt++;
			}
		}
		System.out.println("등장횟수 -> " + cnt);
		
	}

}
