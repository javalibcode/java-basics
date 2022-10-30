package learn.java.innerclass;

public class AnnonymousInnerClassDemo {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Running Thread from Annonymous Class");

			}

		});

		t.start();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable Demo");

			}
		};

		Thread t2 = new Thread(runnable);
		t2.start();

	}

}
