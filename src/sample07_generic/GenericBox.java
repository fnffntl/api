package sample07_generic;

public class GenericBox<T> {

	private T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
