package learn.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) {

		InputStream inStream = null;
		OutputStream outStream = null;
		try {

			inStream = new FileInputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\Image.jpg");
			outStream = new FileOutputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\CopyImage.jpg");

			int byteData = -1;
			while ((byteData = inStream.read()) != -1) {
				//System.out.print((char) byteData);
				outStream.write(byteData);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (inStream != null)
					inStream.close();
				if (outStream != null)
					outStream.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
