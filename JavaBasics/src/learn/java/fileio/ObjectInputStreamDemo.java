package learn.java.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;
		ObjectInputStream inputStream = null;

		try {
			fileInputStream = new FileInputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\StudentData.ser");
			inputStream = new ObjectInputStream(fileInputStream);

			Object object = inputStream.readObject();
			Student student = (Student) object;
			System.out.println(student.getId() + " - " + student.getName());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
