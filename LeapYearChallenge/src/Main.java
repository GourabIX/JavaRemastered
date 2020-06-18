public class Main {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }
}
