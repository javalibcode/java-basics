
public class AbstractTest {

	public static void main(String[] args) {
		//AbstractExample ae = new AbstractExample();
		AbstractExample ce = new ConcreteAbstractExample(); 
		ce.abstractMethod();
		ce.nonAbstractMethod();

	}

}
