package learn.java.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriteDemo {

	public static void main(String[] args) {

		Reader fileReader = null;
		Writer fileWriter = null;
		try {
			fileReader = new FileReader("D:\\Workspace\\java-basics\\JavaBasics\\src\\filereader.txt");
			fileWriter = new FileWriter("D:\\Workspace\\java-basics\\JavaBasics\\src\\filewriter.txt", true);
			int ch = -1;
			while ((ch = fileReader.read()) != -1) {
				// System.out.print((char) ch);
				fileWriter.append((char) ch);

			}
			fileWriter.flush();
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
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Completed");
	}

}
