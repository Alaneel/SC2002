public class Gregorian {
    public static void main(String[] args) {
        int year = 1582;
        int month = 10;
        int day = 15;

        System.out.println((year < 1582) || (year == 1582 && month < 10) || (year == 1582 && month == 10 && day < 15));
    }
}
