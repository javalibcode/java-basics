package learn.java.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberSystemDemo {

	public static void main(String[] args) {
		Double amount = 1234561234567.9876;

		Locale in = new Locale("en", "IN");

		String indAmount = NumberFormat.getCurrencyInstance(in).format(amount);
		String frAmount = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
		String usAmount = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
		String ukAmount = NumberFormat.getCurrencyInstance(Locale.UK).format(amount);

		System.out.println("India: " + indAmount);
		System.out.println("France: " + frAmount);

		System.out.println("US: " + usAmount);
		System.out.println("UK: " + ukAmount);

	}

}
