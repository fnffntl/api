package sample04_wrapper;

public class WrapperApp3 {
	
	public static void main(String[] args) {	
		
		// Wrapper 클래스의 주요 API
		
		// int Integer.parseInt(String text) : 숫자로 구성된 문자열을 정수로 변환해서 반환한다.
		int num1 = Integer.parseInt("234");
		int num2 = Integer.parseInt("123");
		
		// int Integer.parseInt(String text, int radix) : 숫자로 구성된 문자열을 지정된 진법으로 환산해서 정수로 변환한 다음 반환한다.
		int num3 = Integer.parseInt("1001", 2);	// 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0 = 8 + 0 + 0 + 1 = 9
		System.out.println(num3);
		int num4 = Integer.parseInt("1a", 16);	// 1*16^1 + 10*16^0 = 16 + 10 = 26
		System.out.println(num4);
		
		// String Integer.toBinaryString(int num) : 지정된 정수를 2진수 문자열로 변환한다.
		// String Integer.toOctalString(int num) : 지정된 정수를 8진수 문자열로 변환한다.
		// String Integer.toHexString(int num) : 지정된 정수를 16진수 문자열로 변환한다.
		String str1 = Integer.toBinaryString(54);	// 54를 2진수로 변환했을 때 값을 문자열로 반환한다.
		String str2 = Integer.toOctalString(54);	// 54를 8진수로 변환했을 때 값을 문자열로 변환한다. 
		String str3 = Integer.toHexString(54);		// 54를 16진수로 변환했을 때 값을 문자열로 변환한다. 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}
	

}
