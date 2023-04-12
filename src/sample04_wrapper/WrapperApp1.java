package sample04_wrapper;

public class WrapperApp1 {
	
	public static void main(String[] args) {
		// 오토박싱
		// 기본자료형값을 객체타입의 변수에 대입하면
		// 자동으로 해당 타입의 Wrapper객체게 생성되어 대입된다.
		Boolean a = true;	// Boolean a = new Boolean(true);
		Character b = 'A';	// Character b = new Character('A');
		Integer c = 10;		// Integer c = new Integer(10);
		Long d = 1000000L;	// Long d = new Long(1000000L);
		Double e = 3.14;	// Double e = new Double(3.14);
		
		// 변수의 타입이 Object인 경우에도 해당 타입의 Wrapper객체가 생성되어 대입된다.
		// 참조변수는 실제 생성한 Wrapper객체의 부모객체인 Object객체를 참조한다.
		Object a1 = true;
		Object b1 = 'A';
		Object c1 = 10;
		Object d1 = 1000000L;
		Object e1 = 3.14;
		
		System.out.println(a);	// Boolean에 재정의된 toString() 반환값이 출력된다.
		System.out.println(b);	// Integer에 재정의된 toString() 반환값이 출력된다.
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		
//		String a2 = true;
//		String b2 = 'A';
//		String c2 = 10;
//		String d2 = 1000000L;
//		String e2 = 3.14;
	}
}
