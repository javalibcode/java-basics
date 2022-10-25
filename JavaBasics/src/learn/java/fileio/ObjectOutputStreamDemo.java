package learn.java.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream outputStream = null;

		try {
			fileOutputStream = new FileOutputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\StudentData.ser");
			outputStream = new ObjectOutputStream(fileOutputStream);

			Student student = new Student(2, "Java-1");
			outputStream.writeObject(student);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
