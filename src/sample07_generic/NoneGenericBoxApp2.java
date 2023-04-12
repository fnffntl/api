package sample07_generic;

public class NoneGenericBoxApp2 {
	public static void main(String[] args) {
		
		// 문자열을 저장하는 box객체 생성하기
		NoneGenericBox box1 = new NoneGenericBox();
//		box1.setItem("홍길동");
		box1.setItem(100);	// box객체 생성목적과 맞지 않는 객체가 저장될 수 있다.
		
		// 문자열을 저장하는 box객체 생성하기
		NoneGenericBox box2 = new NoneGenericBox();
		box2.setItem("홍길동");
		
		int value = (Integer)box2.getItem();	// 잘못된 형변환 오류가 코딩과정에서 체크되지 않는다.
		System.out.println(value);
		
	}
}
