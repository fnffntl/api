package sample07_generic;

public class GenericPhoneBox<T extends Phone>{
	private T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
