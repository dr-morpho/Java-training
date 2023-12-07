package methoods;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marlon", 28);
        System.out.println(person);
        
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(6) + 5;
            System.out.print(a + " ");
        }
        
        System.out.println("\n");
        
        Cube.getRandomNum();
    }
}