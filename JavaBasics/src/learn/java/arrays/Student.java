package learn.java.arrays;

public class Student {

	private int stdID;
	private String stdName;

	public Student(int stdID, String stdName) {

		this.stdID = stdID;
		this.stdName = stdName;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override // These called Meta tags
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + "]";
	}

}
