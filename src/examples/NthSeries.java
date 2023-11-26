package examples;

import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        double res = 1.0;
        double step = 4;
        for(int i = 1; i < n; i++) {
            res += (1 / step);
            step += 3.0;
        }
//        Округление до двух целых чисел:
        String output = Double.toString((double) Math.round(res * 100) / 100);
        return n == 0 ? "0.00" : output.length() < 4 ? output + "0" : output;
    }
    
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
