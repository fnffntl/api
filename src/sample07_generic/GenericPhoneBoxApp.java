package sample07_generic;

public class GenericPhoneBoxApp {
	public static void main(String[] args) {
		
		GenericPhoneBox<Phone> box1 = new GenericPhoneBox<>();
		GenericPhoneBox<SmartPhone> box2 = new GenericPhoneBox<>();
		GenericPhoneBox<FeaturePhone> box3 = new GenericPhoneBox<>();
		
		/*
		 * class GenericPhoneBox<T extends Phone> {
		 * 		T item;
		 * }
		 * 
		 * <T extends Phone>은 타입파라미터 T의 타입으로 Phone 및 그 하위 타입만 가능하다.
		 */
//		GenericPhoneBox<String> box4 = new GenericPhoneBox<>();
//		GenericPhoneBox<Integer> box5 = new GenericPhoneBox<>();
	}
}
