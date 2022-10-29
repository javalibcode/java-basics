package learn.java.generics;

//List<E>
public class CustomObject<T> {

	T obj;

	public CustomObject(T obj) {
		this.obj = obj;
	}

	public void displayClass() {
		System.out.println(this.obj.getClass().getName());
	}

	public void displayObject() {
		System.out.println(this.obj.toString());
	}
}
