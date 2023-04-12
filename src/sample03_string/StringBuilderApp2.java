package sample03_string;

public class StringBuilderApp2 {
	public static void main(String[] args) {
		// StringBuilder객체에 값을 추가하고, 문자열로 반환하기
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		sb.append(",");
		sb.append("1학년");
		sb.append(",");
		sb.append("컴퓨터공학과");
		sb.append(",");
		sb.append(100);
		sb.append(",");
		sb.append(80);
		sb.append(",");
		sb.append(100);
		
		String text = sb.toString();
		System.out.println("텍스트 데이터 -> " + text);
		
	}
}
