package learn.java.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {

		// formatting date in dd/MM/yyyy format

		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println("Formatted Date: " + date);

		// String to Date Conversion

		String dateString = "30-10-2022";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date modifiedDate = sdf1.parse(dateString);
		System.out.println("Modified Date: " + modifiedDate);

	}

}
