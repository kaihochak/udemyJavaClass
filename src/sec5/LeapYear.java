package sec5;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if ( year >= 1 && year <= 9999 ) {
            if ( (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                result = true;
            } else if ( (year % 4 == 0) && (year % 100 != 0) ) {
                result = true;
            }
        }

        return result;
    }
}
