package sample03_string;

import java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {
		// StringJoiner
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("홍길동");
		joiner.add("김유신");
		joiner.add("강감찬");
		joiner.add("이순신");
		joiner.add("류관순");
		joiner.add("안중근");

		String text = joiner.toString();
		System.out.println(text);
	}

}
