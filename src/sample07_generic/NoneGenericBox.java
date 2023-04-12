package sample07_generic;

public class NoneGenericBox {
	
	// Object타입의 변수에는 모든 객체를 대입할 수 있다.
	private Object item;
	
	// item에 저장된 객체는 객체의 종류와 상관없이, 조회하면 항상 Object타입의 주소값을 반환한다.
	public Object getItem() {
		return item;
	}
	// setItem 메소드로 전달한 객체는 객체의 종류와 상관없이, 전달받은 객체의 최상위 객체인 Object타입으로 형변환된다.
	// 즉, item 변수에 대입되는 주소값은 전달객체의 주소값이 아니라 클래스형변환된 Object객체의 주소값이 저장된다.
	public void setItem(Object item) {
		this.item = item;
	}
}
