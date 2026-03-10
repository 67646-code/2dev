public class MathUtil {
    public static final double PI = 3.1415926535897932;
    public static final double E = 2.718281828459045;

    static double circleArea(double radius) {
        return PI*radius*radius;
    }

    static double circlePerimeter(double radius) {
        return radius*(2*PI);
    }

    static double ellipseArea(double a, double b) {
        return a*b*PI;
    }
}

