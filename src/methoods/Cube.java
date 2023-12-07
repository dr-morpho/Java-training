package methoods;

import java.util.Random;

public class Cube {
    public static void getRandomNum(){
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            int elem = random.nextInt(6);
            System.out.println(String.format("Ваше число: %s", elem));
        }
    }
}
