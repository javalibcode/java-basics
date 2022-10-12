package learn.java.object;

public class Sample {

	private int value;

	public Sample(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		if (value != other.value)
			return false;
		return true;
	}

	
	public String toString() {
		return "Sample [value=" + value + "]";
	}

	public void printValue() {
		System.out.println("Method: " + value);
	}

	/*
	 * public int hashCode() { return value+10; }
	 * 
	 * public String toString() { return String.valueOf(value); }
	 * 
	 * public boolean equals(Object obj) { Sample toCompare = (Sample)(obj); return
	 * (this.value == toCompare.value); }
	 */

}
