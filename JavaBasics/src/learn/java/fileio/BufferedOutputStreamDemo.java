package learn.java.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {

		InputStream fileInputstream = null;
		BufferedInputStream bufferedInputStream = null;
		OutputStream fileOutputstream = null;
		BufferedOutputStream bufferedOutputStream = null;
		long startTime = System.currentTimeMillis(); // 100
		byte[] readData = new byte[1024];
		try {
			fileInputstream = new FileInputStream("D:\\Workspace\\java-basics\\JavaBasics\\src\\InputStreamRead.txt");
			bufferedInputStream = new BufferedInputStream(fileInputstream);

			fileOutputstream = new FileOutputStream(
					"D:\\Workspace\\java-basics\\JavaBasics\\src\\OutputStreamRead.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputstream);

			while (bufferedInputStream.read(readData) != -1) {
				bufferedInputStream.read(readData);
				bufferedOutputStream.write(readData);
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
			if (bufferedOutputStream != null) {
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fileInputstream != null) {
				try {
					fileInputstream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (fileOutputstream != null) {
				try {
					fileOutputstream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		long endTime = System.currentTimeMillis(); // 102
		System.out.println("\nTotal Time Taken: " + (endTime - startTime));

	}

}
