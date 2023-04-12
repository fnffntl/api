package sample03_string;

import java.util.StringJoiner;

public class StringJoinerApp2 {
	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬","이순신"};
		
		// StringJoiner를 이용한 간편한 방법
		StringJoiner joiner = new StringJoiner(",");
		for(String x : names) {
			joiner.add(x);
		}
		String text = joiner.toString();
		System.out.println(text);
		
		// String을 이용한 불편한 방법
		String text2 = "";
		for(String x: names) {
			text2 += x;
			text2 += ",";
		}
		text2 = text2.substring(0, text2.length() -1);
		System.out.println(text2);
	}
}
