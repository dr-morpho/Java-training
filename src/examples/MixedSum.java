package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        String str = "";
        for(int i = 0; i < mixed.size(); i++) {
            str += mixed.get(i);
        }
        int res = 0;
        String[] arrStr = str.split("");
        for(int j = 0; j < arrStr.length; j++) {
            res += Integer.parseInt(arrStr[j]);
        }
        return res;
    }
    
    public static int sumTwo(List<?> mixed) {
        int[] intList = new int[mixed.size()];
        int output = 0;
        for(int i = 0; i < mixed.size(); i++) {
            intList[i] = Integer.parseInt(mixed.get(i) + "");
//            (mixed.get(i) + "") - конвертирует каждый элемент в строку.
        }
        for(int i = 0; i < intList.length; i++) {
            output += intList[i];
        }
        return output;
    }
    
    public static int sumTest(List<?> mixed) {
        int output = 0;
        for(int i = 0; i < mixed.size(); i++) {
            output += Integer.parseInt(mixed.get(i) + "");
        }
        return output;
    }
    
    public int sumThree(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
    
    public static void main(String[] args) {
        System.out.println(sumTest(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }
    
}
