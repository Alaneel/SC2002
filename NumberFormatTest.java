import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatTest {
    public static void main(String[] args) {
        // Print a number using the localized number, integer, currency, and percent format for each available locale
        Locale[] locales = NumberFormat.getAvailableLocales();
        double myNumber = -1234.56;
        NumberFormat format;

        // General Number format
        System.out.println("General Format:");
        for (Locale locale: locales) {
            if (locale.getCountry().length() == 0) continue; // Skip language-only locales
            format = NumberFormat.getInstance(locale);
            System.out.printf("%40s -> %s%n", locale.getDisplayName(), format.format(myNumber));
        }

        // Integer format
        System.out.println("Integer Format:");
        for (Locale locale: locales) {
            if (locale.getCountry().length() == 0) continue; // Skip language-only locales
            format = NumberFormat.getIntegerInstance(locale); 
            System.out.printf("%40s -> %s%n", locale.getDisplayName(), format.format(myNumber));
        }

        // Currency format
        System.out.println("Currency Format:");
        for (Locale locale: locales) {
            if (locale.getCountry().length() == 0) continue; // Skip language-only locales
            format = NumberFormat.getCurrencyInstance(locale); 
            System.out.printf("%40s -> %s%n", locale.getDisplayName(), format.format(myNumber));
        }

        // Percent format
        System.out.println("Percent Format:");
        for (Locale locale: locales) {
            if (locale.getCountry().length() == 0) continue; // Skip language-only locales
            format = NumberFormat.getPercentInstance(locale); 
            System.out.printf("%40s -> %s%n", locale.getDisplayName(), format.format(myNumber));
        }
    }
}
