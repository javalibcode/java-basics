package learn.java.innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {

		Outer o = new Outer(1);
		o.print();

		Outer.StaticInner si = new Outer.StaticInner(2);
		si.printValue();
		
		Outer.StaticInner.print(); // Static

		Outer.NonStaticInner nsi = o.new NonStaticInner(3);
		nsi.print();

	}

}
