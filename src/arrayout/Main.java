package arrayout;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String[] elems = {"1","2","3"};
            for(int i = 0; i <= elems.length; i++){
                System.out.println(elems[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong!: " + e);
        }
    }
}
