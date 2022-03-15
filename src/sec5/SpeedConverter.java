package sec5;

public class SpeedConverter {

    // return the rounded value of the calculation of type long
    public static long toMilesPerHour(double kilometersPerHour) {

        long value;

        // return invalid value, if input < 0
        if (kilometersPerHour < 0) {
            value = -1;
        } else {
            // otherwise, return rounded converted value
            value = Math.round(kilometersPerHour / 1.609);
        }

        return value;
    }

    // printing conversion from given km to miles
    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}