package learn.java.enumdemo;

public class DayEnumDemo {

	public static void main(String[] args) {

		Day[] values = Day.values();
		for (Day day : values) {
			System.out.println("Ordinal: " + day.ordinal() + " - " + "Name: " + day.name() + " Is it Working Day: "
					+ day.isWorkingDay());

		}

	}

}
