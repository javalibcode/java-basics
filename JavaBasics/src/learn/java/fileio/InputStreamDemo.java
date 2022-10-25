package learn.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) {

		InputStream stream = null;
		long startTime = System.currentTimeMillis(); //100
		try {

			stream = new FileInputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\InputStreamRead.txt");
			int byteData = -1;
			while ((byteData = stream.read()) != -1)
				System.out.print((char) byteData);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (stream != null)
					stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis(); //102
		System.out.println("\nFile Input Stream: "+ (endTime - startTime ));

	}

}
