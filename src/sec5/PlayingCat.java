package sec5;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean result = false;
        final int lowerBound = 25;
        final int upperBound = 35;

        if ( temperature >= lowerBound ) {
            if ( !summer && ( temperature <= upperBound ) ) {
                result = true;
            } else if ( summer && ( temperature <= (upperBound + 10) ) ) {
                result = true;
            }
        }

        return result;
    }
}
