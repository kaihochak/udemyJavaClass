package sec5;

public class EqualSumChecker {
    public static boolean hasEqualSum(int x, int y, int z) {
        boolean result = false;

        if ((x + y) == z) {
            result = true;
        }

        return result;
    }

}
