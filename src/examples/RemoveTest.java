package examples;

import java.util.Arrays;

public class RemoveTest {
    private static String[] array = {"A", "b", "c", "d", "e", "f", "g", "h"};
    
    public static String[] remove(String[] input, int index) {
        String[] strArr = new String[input.length - 1];
        for (int i = 0; i < index; i++) {
            strArr[i] = input[i];
            for(int j = index; j < input.length - 1; j++){
                strArr[j] = input[j + 1];
            }
        }
        return strArr;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(remove(array, 3)));
    }
}
