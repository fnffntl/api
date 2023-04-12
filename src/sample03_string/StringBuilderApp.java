package sample03_string;

public class StringBuilderApp {
	public static void main(String[] args) {
		/*
		 *  StringBuilder와 StringBuffer
		 *  - 문자열의 변경이 빈번할 때 사용하는 객체이다.
		 *  - 문자열에 대한 변경이 발생하더라도 새 객체가 생성되지 않고,
		 *    객체 내부의 임시저장소에 변경내용이 반영된다.
		 *  주요 메소드
		 *  	StringBuilder	append(값)
		 *  		StringBuilder에 문자열을 추가하고, StringBuilder를 반환한다.
		 *  	StringBuffer	append(값)
		 *  		StringBuffer에 문자열을 추가하고, StringBuffer를 반환한다.
		 *  	String			toString()
		 *  		Object의 toString()을 재정의한 메소드이다.
		 *  		StringBuilder나 StringBuffer의 임시저장소에 저장된 값을 하나의 문자열로 반환한다.
		 */
		
		// 아래의 코드를 실행하면, String객체는 매번 새로운 객체가 생성되기 때문에 hashCode값이
		// 각각 다르게 출력되고, StringBuilder는 문자열을 추가해도 객체가 새로 생성되지 않는다.
		System.out.println("### String객체에 문자열 추가하기");
		String str = "hello";
		System.out.println("String객체의 hashCode값 -> " + str.hashCode());
		str += " 홍길동";
		System.out.println("String객체의 hashCode값 -> " + str.hashCode());
		str += " 님 반갑습니다.";
		System.out.println("String객체의 hashCode값 -> " + str.hashCode());
		
		System.out.println();
		
		System.out.println("### StringBuilder객체에 문자열 추가하기");
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("StringBuilder객체의 hashCode값 -> " + sb.hashCode());
		sb.append(" 홍길동");
		System.out.println("StringBuilder객체의 hashCode값 -> " + sb.hashCode());
		sb.append(" 님 반갑습니다.");
		System.out.println("StringBuilder객체의 hashCode값 -> " + sb.hashCode());
	}
}
