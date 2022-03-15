package sec5;

public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {
        boolean result = false;
        int[] num = {x, y, z};

        for (int i : num) {
            if ( isTeen(i) ) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isTeen(int x) {
        boolean result = false;

        if ( (x >= 13) && (x <=19) ) {
            result = true;
        }

        return result;
    }
}
