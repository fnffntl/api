package sample06_math;

/*
 * 정적 import 구문
 * 	- static 변수, static 메소드, static 내부 클래스를 import 시킨다.
 * 	- java 5부터 지원한다.
 * 	- static import 구문으로 포함시킨 변수, 메소드, 내부클래스는 클래스이름 없이 사용할 수 있다.
 * 	- 예시
 * 		* Math 클래스의 정적메소드 abs를 import한다.
 * 			import static java.lang.Math.abs;	// <-- 이걸 더 선호함.
 * 			수행문에서 사용하기
 * 				int 절댓값 = abs(-100);	<-- Math.abs() 메소드 사용
 * 		* Math 클래스의 모든 정적 구성요소를 import한다.
 * 			import static java.lang.Math.*;
 * 			수행문에서 사용하기
 * 				int 절댓값 = abs(-100);	<-- Math.abs() 메소드 사용
 * 				int 큰값 = max(100, 90);	<-- Math.max() 메소드 사용
 */
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Mathapp1 {

	public static void main(String[] args) {
		// Math 클래스의 주요 메소드

		// 절댓값을 반환하는 메소드
		int value1 = abs(100);
		int value2 = abs(-100);
		double value3 = abs(3.14);
		double value4 = abs(-3.14);
		System.out.println("절댓값1 -> " + value1);
		System.out.println("절댓값2 -> " + value2);
		System.out.println("절댓값3 -> " + value3);
		System.out.println("절댓값4 -> " + value4);

		// 큰 값을 반환하는 메소드
		int value5 = max(100, 20);
		double value6 = max(2.145, 10.4);
		double value7 = max(100,23.45);		//max(double, double)이 실행됨
		System.out.println("큰값5 -> " + value5);
		System.out.println("큰값6 -> " + value6);
		System.out.println("큰값7 -> " + value7);

		// 작은 값을 반환하는 메소드
		int value8 = min(100, 20);
		double value9 = min(2.145, 10.4);
		double value10 = min(100,23.45);		//min(double, double)이 실행됨
		System.out.println("작은값8 -> " + value8);
		System.out.println("작은값9 -> " + value9);
		System.out.println("작은값10 -> " + value10);

		// 반올림된 값을 반환하는 메소드
		long value11 = round(3.14);
		long value12 = round(3.5);
		long value13 = round(3.6);
		System.out.println("반올림값11 -> " + value11);
		System.out.println("반올림값12 -> " + value12);
		System.out.println("반올림값13 -> " + value13);

		// 천장값(ceil값)을 반환하는 메소드
		double value14 = ceil(3.0);
		double value15 = ceil(3.1);
		double value16 = ceil(3.4);
		double value17 = ceil(3.8);
		double value18 = ceil(4.0);
		System.out.println("ceil값 -> " + value14);
		System.out.println("ceil값 -> " + value15);
		System.out.println("ceil값 -> " + value16);
		System.out.println("ceil값 -> " + value17);
		System.out.println("ceil값 -> " + value18);
		
		// 바닥값(floor값)을 반환하는 메소드
		double value19 = floor(4.0);
		double value20 = floor(3.9);
		double value21 = floor(3.5);
		double value22 = floor(3.2);
		double value23 = floor(3.0);
		System.out.println("floor값 -> " + value19);
		System.out.println("floor값 -> " + value20);
		System.out.println("floor값 -> " + value21);
		System.out.println("floor값 -> " + value22);
		System.out.println("floor값 -> " + value23);
		
		// 난수(0보다 크거나 같고 1보다 작은 실수)를 반환하는 메소드
		// (int)(random()*N) : 0보다 크거나 같고 N보다 작은 정수를 반환한다.
		// (int)(random()*N + 1) : 1보다 크거나 같고 N보다 작거나 같은 정수를 반환한다.
		System.out.println("난수 -> " + (int)(random()*10));
		System.out.println("난수 -> " + (int)(random()*100));
		System.out.println("난수 -> " + (int)(random()*1000));

	}
}
