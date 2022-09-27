
public class InheritanceTest {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Bus b = new Bus();

		Vehicle v1 = new Bus();

		v.move();
		b.accelerate();

		System.out.println(b.power);
		b.move();

		System.out.println(v1.power);
		v1.move();

	}

}
