
public class Bus extends Vehicle {

	int speed = 50;

	void accelerate() {
		move(); 
		System.out.println("Bus is moving with Speed: " + speed);
	}

}
