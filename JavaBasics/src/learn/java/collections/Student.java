package learn.java.collections;

public class Student implements Comparable {

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@Override
	public int hashCode() {
		return this.studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		Student s = (Student) obj;
		if (!(s instanceof Student))
			return false;

		if (this.studentId != s.getStudentId())
			return false;

		return true;
	}

	@Override
	public int compareTo(Object o) {

		Student s = (Student) o;
		if (this.studentId < s.getStudentId())
			return -1;

		if (this.studentId > s.getStudentId())
			return 1;

		return 0;
	}

}
