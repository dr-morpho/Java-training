package gamerandom;

import java.util.Random;

public class Main {
    final static int bound = 1_000_000_000;
    static boolean win = false;
    static Random random = new Random();
    static int number = random.nextInt(bound);
    
    public static void main(String[] args) {
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                int numberTwo;
                do {
                    numberTwo = random.nextInt(bound);
                }
                while (numberTwo != number);
                win = true;
                System.out.println("Число: " + numberTwo);
            }
        });
        threadTwo.start();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    if (win) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        threadOne.start();
    }
}
