package learn.java.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		InputStream stream = null;
		BufferedInputStream bufferedInputStream = null;
		long startTime = System.currentTimeMillis(); // 100
		byte[] readData = new byte[1024];
		try {
			stream = new FileInputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\InputStreamRead.txt");
			bufferedInputStream = new BufferedInputStream(stream);

			while (bufferedInputStream.read(readData) != -1) {
				bufferedInputStream.read(readData);

				for (byte b : readData) {
					System.out.print((char) b);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		long endTime = System.currentTimeMillis(); // 102
		System.out.println("\nFile Input Stream: " + (endTime - startTime));

	}

}
