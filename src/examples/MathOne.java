package examples;

public class MathOne {
    private static final double PI = 3.14;
    
    public static double lengCircle(double radius) {
        return 2 * PI * radius;
    }
    
//    varargs:
    public static int sum(int... input) {
        int res = 0;
        for(int i = 0; i < input.length; i++){
            res += input[i];
        }
        return res;
    }
    
    public static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
    public static int multiple(int a, int b) {
        return a * b;
    }
    
    public static double multiple(double a, double b){
        return a * b;
    }
    
    public static int multiple(int a) {
        return a * a;
    }
    
    public static double multiple(double a) {
        return a * a;
    }
}
