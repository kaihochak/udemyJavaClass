package sec5;

public class AreaCalculator {

    public static double area(double radius) {
        double result;

        if ( radius < 0) {
            result = -1.0;
        } else {
            result = Math.PI * radius * radius;
        }

        return result;
    }

    public static double area(double x, double y) {
        double result;

        if ( x < 0 || y < 0) {
            result = -1.0;
        } else {
            result = x * y;
        }

        return result;
    }

}
