package sample03_string;

public class StringApp2 {
	public static void main(String[] args) {
		// String의 주요 API
		String str1 = "public static void main(String[] args)";
		
		// int length() : 문자열의 길이를 반환한다.(공백 포함)
		int len = str1.length();
		System.out.println("문자열의 길이 -> " + len);
		
		// String toUpperCase() : 문자열에 대해서 대문자로 변환된 새 문자열을 반환한다.
		// String toLowerCase() : 문자열에 대해서 소문자로 변환된 새 문자열을 반환한다.
		String text1 = str1.toUpperCase();
		String text2 = str1.toLowerCase();
		System.out.println("대문자로 변환된 문자열 -> " + text1);
		System.out.println("소문자로 변환된 문자열 -> " + text2);		
		System.out.println(str1);
		
		// boolean contains(CharSequence text) : 문자열에 text에 해당하는 문자열이 포함되어 있으면 true를 반환한다. 
		boolean isContains = str1.contains("main");
		System.out.println("지정한 문자열이 포함되어 있는가? " + isContains);
		
		// boolean isEmpty() : 문자열이 빈 문자열이면 true를 반환한다. 길이가 0인 문자열일 때 true를 반환한다.
		// boolean isBlank() : 문자열이 비어있으면 true를 반환한다. 길이가 0인 문자열과 공백, 탭만 포함하고 잇을 때 true를 반환한다.
		System.out.println("".isEmpty());		// true
		System.out.println("  ".isEmpty());		// false, 공백문자가 여러개 포함되어 있기 때문에 빈 문자열이 아니다.
		System.out.println("".isBlank());		// true
		System.out.println("  ".isBlank());		// true, 공백문자, 탭문자로만 구성되어 있으면 true를 반환한다.
		
		// String substring(int beginIndex) : 문자열에 지정된 시작위치부터 문자열의 끝까지 포함된 새 문자열을 반환한다.
		// String substring(int beginIndex, int endIndex) : 문자열에 지정된 범위의 문자열이 포함된 새 문자열을 반환한다.
		String str2 = "Returns the char value at the specified index.";
		String text3 = str2.substring(11);
		String text4 = str2.substring(2, 9);
		System.out.println("첫번째 부분문자열 -> " + text3);
		System.out.println("두번째 부분문자열 -> " + text4);
		
		// int indexOf(int ch) : 문자열에서 지정된 문자가 등장하는 인덱스를 반환한다.
		// int indexOf(int ch, int fromIndex) : 지정된 위치에서부터 검색했을 때 지정된 문자가 등장하는 인덱스를 반환한다.
		// int indexOf(Stirng text) : 문자열에서 지정된 문자열이 등장하는 인덱스를 반환한다. 
		// int indexOf(String text, int fromIndex) : 지정된 위치에서부터 검색했을 때 지정된 문자열이 등장하는 인덱스를 반환한다.
	
		// int lastIndexOf(int ch) : 문자열의 끝에서부터 역순으로 지정된 문자가 등장하는 인덱스를 반환한다. 
		// int lastIndexOf(int ch, int fromIndex) : 지정된 위치에서부터 역순으로 지정된 문자가 등장하는 인덱스를 반환한다.
		// int lastIndexOf(Stirng text) : 문자열의 끝에서부터 역순으로 지정된 문자열이 등장하는 인덱스를 반환한다. 
		// int lastIndexOf(String text, int fromIndex) : 지정된 위치에서부터 역순으로 지정된 문자열이 등장하는 인덱스를 반환한다.
		String str3 = "Returns the char value at the specified index.";
		int index1  = str3.indexOf('t');
		int index2  = str3.indexOf('t', 20);
		int index3  = str3.indexOf("the");
		int index4  = str3.indexOf("the", 20);
		int index5 = str3.indexOf("color");
		System.out.println("등장위치 -> " + index1);	// 2, Re't'
		System.out.println("등장위치 -> " + index2);	// 24, value a't'
		System.out.println("등장위치 -> " + index3);	// 8, Returns "the"
		System.out.println("등장위치 -> " + index4);	// 26, value at "the"
		System.out.println("등장위치 -> " + index5);	// -1, 일치하는 것이 존재하지 않는다.
		
		int index6 = str3.lastIndexOf("i");
		int index7 = str3.lastIndexOf("i", 20);
		System.out.println("등장위치 -> " + index6);	// 40, 'i'ndex
		System.out.println("등장위치 -> " + index7);	// -1, 일치하는 것이 존재하지 않는다.
		
		// char charAt(int index) : 문자열에서 지정된 위치의 문자를 반환한다.
		String str4 = "abcdefghijklmn";
		char ch1 = str4.charAt(5);
		char ch2 = str4.charAt(10);
//		char ch3 = str4.charAt(20);	// 문자열의 인덱스 범위를 벗어난 값은 StringIndexOutofBoundException 오류가 발생한다.
		System.out.println("5번째 문자 -> " + ch1);
		System.out.println("10번째 문자 -> " + ch2);
//		System.out.println("20번째 문자 -> " + ch3);
		
		// String[] split(String regex) : 문자열을 구분자(지정된 표현식)로 잘라서 배열에 담아 반환한다.
		String str5 = "김유신,강감찬,이순신,류관순";
		String[] arr1 = str5.split(",");
		System.out.println(arr1[0]);	// "김유신,강감찬,이순신,류관순" -> {"김유신", "강감찬", "이순신", "류관순"}
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		String str6 = "홍길동";
		String[] arr2 = str6.split("");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		// boolean startsWith(String prefix) : 문자열이 지정된 텍스트로 시작하면 true를 반환한다.
		// boolean endsWith(String suffix) : 문자열이 지정된 텍스트로 끝나면 true를 반환한다.
		String str7 = "http://www.daum.net";
		String str8 = "localhost/index.html";
		boolean result1 = str7.startsWith("http");
		boolean result2 = str8.endsWith("html");
		System.out.println("http로 시작하는가? -> " + result1);
		System.out.println("http로 시작하는가? -> " + result2);
		
		// String trim() : 문자열의 좌우에 위치한 공백문자가 제외된 새 문자열을 반환한다.
		String str9 = "  자바의   정석  ";
		String str10 = str9.trim();
		System.out.println("[" + str9 + "]");
		System.out.println("[" + str10 + "]");
		
		// String replace(CharSequence target, CharSequence replacement)
		// 문자열에서 target에 해당하는 내용을 replacement의 내용으로 변경한 새 문자열을 반환한다.
		String str11 = "I have macbook air and macbook pro";
		String str12 = str11.replace("macbook", "galaxy");
		System.out.println("원본 문자열 -> " + str11);
		System.out.println("새 문자열 -> " + str12);
		
		// String replaceAll(String regexp, String replacement)
		// 문자열에서 정규표현식 패턴에 해당하는 내용을 지정된 문자열로 변환한다.
		String str13 = "홍길동의 집 전화번호는 02-1111-1111이고, 핸드폰 번호는 010-2222-2222번이다.";
		String str14 = str13.replaceAll("-\\d{3,4}-", "-[****]-");
		System.out.println(str14);
		
	}
}
