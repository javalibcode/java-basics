package learn.java.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) {

		Reader fileReader = null;
		try {
			fileReader = new FileReader("D:\\Workspace\\java-basics\\JavaBasics\\src\\filereader.txt");
			int ch = -1;
			while ((ch = fileReader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
