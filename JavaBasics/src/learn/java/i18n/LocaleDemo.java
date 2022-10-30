package learn.java.i18n;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {

		Locale us = Locale.US;
		Locale uk = Locale.UK;

		System.out.println("Available Locales");
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale locale : locales) {
			System.out.println(locale.getCountry() + " - " + locale.getLanguage());
		}

		System.out.println(
				"Default Locale: " + Locale.getDefault().getCountry() + " " + Locale.getDefault().getLanguage());

		String[] isoCountries = Locale.getISOCountries();

		System.out.println("Available Countries");
		for (String country : isoCountries) {
			System.out.println(country);
		}

	}

}
