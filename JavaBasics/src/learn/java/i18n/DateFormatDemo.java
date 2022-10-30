package learn.java.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();

		DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat inDF = DateFormat.getDateInstance(0, new Locale("en", "IN"));

		System.out.println("US Date: " + usDF.format(d));
		System.out.println("UK Date: " + ukDF.format(d));
		System.out.println("India Date: " + inDF.format(d));
		System.out.println("**************************");

		DateFormat usTime = DateFormat.getTimeInstance(0, Locale.US);
		DateFormat ukTime = DateFormat.getTimeInstance(0, Locale.UK);
		DateFormat inTime = DateFormat.getTimeInstance(0, new Locale("en", "IN"));

		System.out.println("US Time: " + usTime.format(d));
		System.out.println("UK Time: " + ukTime.format(d));
		System.out.println("India Time: " + inTime.format(d));
		System.out.println("**************************");

		DateFormat usDT = DateFormat.getDateTimeInstance(0, 0, Locale.US);
		DateFormat ukDT = DateFormat.getDateTimeInstance(0, 0, Locale.UK);
		DateFormat inDT = DateFormat.getDateTimeInstance(0, 0, new Locale("en", "IN"));

		System.out.println("US Date & Time: " + usDT.format(d));
		System.out.println("UK Date & Time: " + ukDT.format(d));
		System.out.println("India Date & Time: " + inDT.format(d));

	}

}
