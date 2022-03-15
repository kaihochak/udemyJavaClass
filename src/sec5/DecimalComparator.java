package sec5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        boolean result = false;

        int newX = (int) (x * 1000);
        int newY = (int) (y * 1000);

        if (newX == newY) {
            result = true;
        }

        return result;
    }
}
