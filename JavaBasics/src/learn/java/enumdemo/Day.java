package learn.java.enumdemo;

public enum Day {

	SUN(false), MON(true), TUE(true), WED(true), THU(true), FRI(true), SAT(false);

	boolean workingDay;

	Day(boolean workingDay) {
		this.workingDay = workingDay;
	}

	public boolean isWorkingDay() {
		return this.workingDay;
	}

}
